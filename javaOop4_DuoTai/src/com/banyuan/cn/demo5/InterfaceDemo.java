package com.banyuan.cn.demo5;

public interface InterfaceDemo  extends InterfaceA,InterfaceB {
    /**
     *  接口可以给类添加额外的功能，在不该父类代码的情况下..
     *  分析接口：1.接口里面的方法  接口里面的方法默认的是抽象的并且是公共抽象的
     *            目前默认的认为接口里面只有 抽象方法 （jdk1.8以后 接口里面可以有普通方法...）
                2.接口里面没有构造方法
                3.接口里面只有常量    public  static  final  String   ADDRESS="";

            接口主要功能就是用来拓展额外功能的   没有一个具体存在...
        接口支持多继承
        普通的类不支持多继承

        如果多个接口里面有相同的功能(方法) 不建议一个类去实现多个接口

        如果抽象类里面的抽象方法和接口里面的抽象方法名一模一样
        一个子类去继承父类和实现接口  你们认为该子类有几个实现方法

     */

    public    abstract  String   showInfo();
                    //   void  show();

     // jdk 1.8 里面接口特性


    public   int   age=12;
    public  String  address="下水道...";



    void show2();




}
