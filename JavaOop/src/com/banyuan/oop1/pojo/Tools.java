package com.banyuan.oop1.pojo;

public class Tools {

    //对象数组
    static  Car[] car=new Car[20];
    static   int count=0;

    static{
        //程序在启动的时候  就把对象值初始化完毕了
        for (int i = 0; i <5; i++) {
            car[i]=new  Car("大奔"+i+"系列","奔驰","rgb"+i,"2018-01-1"+i,"china");
            count++;
            }
    }


    //做添加操作   按照顺讯往数组里面添加对象
    public   static  void   addCar(Car  ca){   //ca   是堆里面的 对象的地址
        car[count++]=ca;
    }

    //移除
    public  static  void   delCar(String   type){
        for (int i = 0; i <count; i++) {
            if(car[i].getCarType().equals(type)){  //equals  比较字符串的内容是否一样
                for(int j=i;j<count;j++){  //
                    car[j]=car[j+1];
                    if(j==count-1){
                        car[j]=null;
                        break;
                    }
                }
                count--;
                break;
            }
            //移除一个之后 count--  为了方便统计有效对象个数
        }
    }

    public   static  void  println(){

        for (int i = 0; i < count; i++) {

                System.out.println(car[i].toString());


        }


    }









}
