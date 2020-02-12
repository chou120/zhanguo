﻿$axure.internal(function($ax) {
    $ax.adaptive = {};

    $axure.utils.makeBindable($ax.adaptive, ["viewChanged"]);

    var _auto = true;
    var _views;
    var _idToView;
    var _enabledViews = [];

    var _initialViewToLoad;

    var _handleResize = function() {
        if(!_auto) return;

        var $window = $(window);
        var height = $window.height();
        var width = $window.width();

        var toView = _getAdaptiveView(width, height);
        var toViewId = toView && toView.id;

        if(toViewId == $ax.adaptive.currentViewId) return;

        _switchView(toViewId);
    };

    var _setAuto = $ax.adaptive.setAuto = function(val) {
        if(_auto != val) {
            _auto = Boolean(val);
            if(val) _handleResize();
        }
    };

    var _setLineImage = function(id, imageUrl) {
        var imageQuery = $jobj(id).attr('src', imageUrl);
        if(imageUrl.indexOf(".png") > -1) $ax.utils.fixPng(imageQuery[0]);
    };

    var _switchView = $ax.adaptive.switchView = function(viewId) {
        // reset all the positioning on the style tags
        $axure('*').each(function(diagramObject, elementId) {
            var element = document.getElementById(elementId);
            if(element && !diagramObject.isContained) {
                element.style.top = "";
                element.style.left = "";
            }
        });

        var previousViewId = $ax.adaptive.currentViewId;
        $ax.adaptive.currentViewId = viewId; // we need to set this so the enabled and selected styles will apply properly
        if(previousViewId) {
            $ax.style.clearAdaptiveStyles();
            $('*').removeClass(previousViewId);
        }

        // reset all the images only if we're going back to the default view
        if(!viewId) {
            $axure('*').each(function(diagramObject, elementId) {
                var images = diagramObject.images;
                if(diagramObject.type == 'horizontalLine' || diagramObject.type == 'verticalLine') {
                    var startImg = images['start~'];
                    _setLineImage(elementId + "_start", startImg);
                    var endImg = images['end~'];
                    _setLineImage(elementId + "_end", endImg);
                    var lineImg = images['line~'];
                    _setLineImage(elementId + "_line", lineImg);
                } else {
                    if(!images) return;
                    if($ax.style.IsWidgetDisabled(elementId)) {
                        var disabledImage = $ax.style.getElementImageOverride(elementId, 'disabled') || images['disabled~'];
                        if(disabledImage) $ax.style.applyImage(elementId, disabledImage, 'disabled');
                        return;
                    }
                    if($ax.style.IsWidgetSelected(elementId)) {
                        var selectedImage = $ax.style.getElementImageOverride(elementId, 'selected') || images['selected~'];
                        if(selectedImage) $ax.style.applyImage(elementId, selectedImage, 'selected');
                        return;
                    }
                    $ax.style.applyImage(elementId, $ax.style.getElementImageOverride(elementId, 'normal') || images['normal~']);
                }

                var child = $jobj(elementId).children('.text');
                if(child.length) $ax.style.transformTextWithVerticalAlignment(child[0].id, function() { });
            });
            // we have to reset visibility if we aren't applying a new view
            $ax.visibility.resetLimboAndHiddenToDefaults();
            $ax.repeater.refreshAllRepeaters();
            $ax.dynamicPanelManager.updateAllFitPanels();
        } else {
            $ax.visibility.clearLimboAndHidden();
            _applyView(viewId);
            $ax.repeater.refreshAllRepeaters();
        }

        $ax.adaptive.triggerEvent('viewChanged', {});
        $ax.viewChangePageAndMasters();
    };

    // gets the inheritance chain of a particular view.
    var _getAdaptiveIdChain = $ax.adaptive.getAdaptiveIdChain = function(viewId) {
        if(!viewId) return [];
        var view = _idToView[viewId];
        var chain = [];
        var current = view;
        while(current) {
            chain[chain.length] = current.id;
            current = _idToView[current.baseViewId];
        }
        return chain.reverse();
    };

    var _getPageStyle = $ax.adaptive.getPageStyle = function() {
        var currentViewId = $ax.adaptive.currentViewId;
        var adaptiveChain = _getAdaptiveIdChain(currentViewId);

        var currentStyle = $.extend({}, $ax.pageData.page.style);
        for(var i = 0; i < adaptiveChain.length; i++) {
            var viewId = adaptiveChain[i];
            $.extend(currentStyle, $ax.pageData.page.adaptiveStyles[viewId]);
        }

        return currentStyle;
    };

    var _setAdaptiveLineImages = function(elementId, images, viewIdChain) {
        for(var i = viewIdChain.length - 1; i >= 0; i--) {
            var viewId = viewIdChain[i];
            var startImg = images['start~' + viewId];
            if(startImg) {
                _setLineImage(elementId + "_start", startImg);
                var endImg = images['end~' + viewId];
                _setLineImage(elementId + "_end", endImg);
                var lineImg = images['line~' + viewId];
                _setLineImage(elementId + "_line", lineImg);
                break;
            }
        }
    };

    var _applyView = $ax.adaptive.applyView = function(viewId, query) {
        var limboIds = {};
        var hiddenIds = {};

        var jquery;
        if(query) {
            jquery = query.jQuery();
            jquery = jquery.add(jquery.find('*'));
        } else {
            jquery = $('*');
            query = $ax('*');
        }
        jquery.addClass(viewId);
        var viewIdChain = _getAdaptiveIdChain(viewId);
        // this could be made more efficient by computing it only once per object
        query.each(function(diagramObject, elementId) {
            _applyAdaptiveViewOnObject(diagramObject, elementId, viewIdChain, viewId, limboIds, hiddenIds);
        });

        $ax.visibility.addLimboAndHiddenIds(limboIds, hiddenIds, query);
        $ax.dynamicPanelManager.updateAllFitPanels();
    };

    var _applyAdaptiveViewOnObject = function(diagramObject, elementId, viewIdChain, viewId, limboIds, hiddenIds) {
        var adaptiveChain = [];
        for(var i = 0; i < viewIdChain.length; i++) {
            var viewId = viewIdChain[i];
            var viewStyle = diagramObject.adaptiveStyles[viewId];
            if(viewStyle) adaptiveChain[adaptiveChain.length] = viewStyle;
        }

        var state = $ax.style.generateState(elementId);

        // set the image
        var images = diagramObject.images;
        if(images) {
            if(diagramObject.type == 'horizontalLine' || diagramObject.type == 'verticalLine') {
                _setAdaptiveLineImages(elementId, images, viewIdChain);
            } else {
                var imgUrl = _matchImage(elementId, images, viewIdChain, state);
                if(imgUrl) $ax.style.applyImage(elementId, imgUrl, state);
            }
            //                for(var i = viewIdChain.length - 1; i >= 0; i--) {
            //                    var viewId = viewIdChain[i];
            //                    var imgUrl = $ax.style.getElementImageOverride(elementId, state) || images[state + '~' + viewId] || images['normal~' + viewId];
            //                    if(imgUrl) {
            //                        $ax.style.applyImage(elementId, imgUrl, state);
            //                        break;
            //                    }
            //                }

            //            }
        }
        // addaptive override style (not including default style props)
        var adaptiveStyle = $ax.style.computeAllOverrides(elementId, undefined, state, viewId);

        // this style INCLUDES the object's my style
        var compoundStyle = $.extend({}, diagramObject.style, adaptiveStyle);

        //$ax.style.setAdaptiveStyle(elementId, adaptiveStyle);
        if(!diagramObject.isContained) {
            $ax.style.setAdaptiveStyle(elementId, adaptiveStyle);
        }

        if(compoundStyle.limbo) limboIds[elementId] = true;
        // sigh, javascript. we need the === here because undefined means not overriden
        if(compoundStyle.visible === false) hiddenIds[elementId] = true;
    };

    var _matchImage = function(id, images, viewIdChain, state) {
        var override = $ax.style.getElementImageOverride(id, state);
        if(override) return override;

        if(!images) return undefined;

        // first check all the images for this state
        for(var i = viewIdChain.length - 1; i >= 0; i--) {
            var viewId = viewIdChain[i];
            var img = images[state + "~" + viewId];
            if(img) return img;
        }
        // check for the default state style
        var defaultStateImage = images[state + '~'];
        if(defaultStateImage) return defaultStateImage;

        state = $ax.style.progessState(state);
        if(state) return _matchImage(id, images, viewIdChain, state);

        // SHOULD NOT REACH HERE! NORMAL SHOULD ALWAYS CATCH AT THE DEFAULT!
        return images['normal~']; // this is the default
    };

    $ax.adaptive.getImageForStateAndView = function(id, state) {
        var viewIdChain = _getAdaptiveIdChain($ax.adaptive.currentViewId);
        var diagramObject = $ax.getObjectFromElementId(id);
        var images = diagramObject.images;

        return _matchImage(id, images, viewIdChain, state);
    };



    var _getAdaptiveView = function(winWidth, winHeight) {
        var _isViewOneGreaterThanTwo = function(view1, view2) {
            return view1.size.width > view2.size.width || (view1.size.width == view2.size.width && view1.size.height > view2.size.height);
        };

        var _isViewOneLessThanTwo = function(view1, view2) {
            var width2 = view2.size.width || 1000000; // artificially large number
            var height2 = view2.size.height || 1000000;

            var width1 = view1.size.width || 1000000;
            var height1 = view1.size.height || 1000000;

            return width1 < width2 || (width1 == width2 && height1 < height2);
        };

        var _isWindowGreaterThanView = function(view, width, height) {
            return width >= view.size.width && height >= view.size.height;
        };

        var _isWindowLessThanView = function(view1, width, height) {
            var viewWidth = view1.size.width || 1000000;
            var viewHeight = view1.size.height || 1000000;

            return width <= viewWidth && height <= viewHeight;
        };

        var greater = undefined;
        var less = undefined;

        for(var i = 0; i < _enabledViews.length; i++) {
            var view = _enabledViews[i];
            if(view.condition == ">=") {
                if(_isWindowGreaterThanView(view, winWidth, winHeight)) {
                    if(!greater || _isViewOneGreaterThanTwo(view, greater)) greater = view;
                }
            } else {
                if(_isWindowLessThanView(view, winWidth, winHeight)) {
                    if(!less || _isViewOneLessThanTwo(view, less)) less = view;
                }
            }
        }
        return less || greater;
    };

    $ax.messageCenter.addMessageListener(function(message, data) {
        if(message == 'setAdaptiveAuto') {
            _setAuto(true);
        } else if(message == 'switchAdaptiveView') {
            if(data == 'default') {
                data = null;
            }

            //If the adaptive plugin hasn't been initialized yet then 
            //save the view to load so that it can get set when initialize occurs
            if(typeof _idToView != 'undefined') {
                _setAuto(false);
                _switchView(data);
            } else {
                _initialViewToLoad = data;
            }
        }
    });


    $ax.adaptive.initialize = function() {
        _views = $ax.document.adaptiveViews;
        _idToView = {};

        if(_views && _views.length > 0) {
            for(var i = 0; i < _views.length; i++) {
                var view = _views[i];
                _idToView[view.id] = view;
            }

            var enabledViewIds = $ax.document.configuration.enabledViewIds;
            for(var i = 0; i < enabledViewIds.length; i++) {
                _enabledViews[_enabledViews.length] = _idToView[enabledViewIds[i]];
            }

            $(window).resize(_handleResize);
            _handleResize();
        }

        //If there is a viewToLoad (switchAdaptiveView message was received prior to init), set it now
        if(typeof _initialViewToLoad != 'undefined') {
            _setAuto(false);
            _switchView(_initialViewToLoad);
        }
    };
});