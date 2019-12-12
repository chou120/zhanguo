package com.banyuan.cn.demo;

public class PolymorphismOne {

    /*
        汽车： 小轿车      卡车     客车     赛车 ...
        动物:  乌龟       狗       猫       猪...
        水：   液态水       冰        水蒸气....


     */

    public static void main(String[] args) {

//        DaZhong   daZhong=new DaZhong();
//        daZhong.cold();
//        daZhong.setBrand("大众奔奔");
//
//        QQ  qq=new  QQ();
//        qq.changeColor();
//        qq.cold();
//
//
//        //  装内衣的盒子   所有的内衣全部放进去
//        QQ  q=new QQ();
//        q.setBrand("Q5");
//        Tool.change(q);


        Car  car=new   QQ();//

        QQ  q=(QQ)car;  //如果要用子类特有的成员  上面写法必须进行强转

        System.out.println(q.city);

//        QQ  q=(QQ)car;
//
//        QQ   qq=new  QQ();

//             car=new   Car();
//             car=new   KaChe();
//             car=new   DaZhong();


//        car.driver();
//        System.out.println(car.city);
//
//        car.method();


       // System.out.println(car.getBrand());


        /**
         * 多态的成员访问
         * 成员变量
         *   编译看左边,运行左边
         *
         * 成员方法
         *  编译看左边,运行看右边

         * 静态方法
         *  编译看左边,运行看左边
         *
         */



        /**
         *  多态:是某一个事物,在不同时刻所表现出来的不同的状态
         *
         *  多态的前提:1.类与类之间有继承关系
         *           2.有方法的重写
         *           3.父类引用指向子类对象
         *
         *
         */


    }




}
