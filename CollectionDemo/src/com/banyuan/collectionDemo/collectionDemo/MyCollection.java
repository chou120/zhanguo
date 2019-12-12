package com.banyuan.collectionDemo.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection implements Collection {

    private Object[] obj;
    private int size;

    public Object[] getObj() {
        return obj;
    }

    public MyCollection() {
        obj = new Object[0];
    }

    public MyCollection(int initCount) {
        // obj=new Object[initCount];
    }

    @Override
    public boolean add(Object e) {
        //数组扩容
        obj = Arrays.copyOf(obj, obj.length + 1);
        obj[obj.length - 1] = e;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (obj == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Object ob : obj) {
            if (ob.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int afterindex = -1;//后一个位置
            @Override
            public boolean hasNext() {
                return afterindex +1 < size;
            }
            @Override
            public Object next() {
                afterindex++; // 0
                return obj[afterindex];
            }
        };
    }
    @Override
    public Object[] toArray() {
        Object[] object = new Object[size];
        for (int i = 0; i < size; i++) {
            object[i] = obj[i];
        }
        return object;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (obj[i].equals(o)) {
                for (int j = i; j < size - 1; j++) {
                    obj[j] = obj[j + 1];
                    if (j + 1 == obj.length - 1) {
                        obj[j + 1] = null;
                        size--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        obj = Arrays.copyOf(obj, obj.length + c.size());
        Object[] o = c.toArray();
        for (int i = 0; i < c.size(); i++) {
            obj[size + i] = o[i];
        }
        size = size + c.size();
        return true;

    }

    @Override
    public void clear() {
        obj = null;
    }

    @Override
    public boolean retainAll(Collection c) {
        // 求交集 并且把交集到调用者的容器里面
        int i = 0, w = 0;
        for (; i < size; i++) {
            if (c.contains(obj[i]) == true) {
                obj[w++] = obj[i];  //
            }
            if (i + 1 == size) {
                size = w;
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {


        return true;
    }

    @Override
    public boolean containsAll(Collection c) {

        //增强for循环    可以对 数组  可以对 集合进行循环遍历
        // 它的底层是  迭代器   可以满足常用一些集合 来用增强for进行遍历
//        for (Object  o: obj) {  // NullPointException
//            System.out.println();
//        }


        Iterator it = c.iterator();
        while (it.hasNext()){
            Object o=it.next();
         //   System.out.println("---"+o);
            if(!contains(o)){  //
                return false;
            }
        }
        return  true;

    }

    @Override
    public Object[] toArray(Object[] a) {

        return new Object[0];
    }
}
