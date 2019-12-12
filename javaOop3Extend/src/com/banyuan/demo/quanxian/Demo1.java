package com.banyuan.demo.quanxian;

public class Demo1 {

    /**
     *
     * 4个访问修饰符      在同一个类中    在同一个包的子类中   在不同的包子类中     不同的包不同的类
     * public            Y             Y               Y                   Y
     * protected         Y             Y               Y
     * 默认的(不写)        Y             Y
     * private           Y  只能在当前类访问
     */

    public   String   name="王五";
             String   address="中央大街";
    protected  String  password="9527";
    private    String  IdCard="1213123121312X";



    public   void   show(){
        System.out.println(name+","+address+password+","+IdCard);
    }





}
