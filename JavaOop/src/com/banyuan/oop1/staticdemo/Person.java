package com.banyuan.oop1.staticdemo;

public class   Person {

//
//    {
//        System.out.println("构造代码块....");
//    }

    static  int  age=12;
    static  String   country="🇨🇳";
    String  name="朱珍雪";

    static  int  i=0;

//    public Person(){
//
//        i++;
//        System.out.println("我是无参构造方法代码块....");
//    }


    public   String  getName(){
        return   name;
    }

    public static  void  getShow(){
        System.out.println("我是静态方法...");
    }

    public   void   get(){
        System.out.println("我叫非静态方法"+i);
    }

    static{
        i++;
        System.out.println("我是静态代码块...");
    }

    {
        i++;
        System.out.println("构造代码块....");
    }


    public  Person(String  name){
        this.name=name;
        i++;
        System.out.println("这是有参代码块....");

    }



}
