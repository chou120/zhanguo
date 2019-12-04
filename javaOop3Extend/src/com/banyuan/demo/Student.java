package com.banyuan.demo;

public class Student extends Person {


    //public  String  city="子类的 在上海";


    public   void    makeMoney(){
        //学生赚钱的方式跟父类不一样  但是 功能都一样  也回去包工程
        System.out.println("student靠自己赚钱,在"+city+"赚钱");

    }
    //当父类和子类有相同的 显示 的方法的时候  如果创建子类对象调用其方法  执行的是哪个类的方法

    //当子类有自己的特有功能的时候  是不是只有子类里面有该功能

    //子类允许自己有特有的方法(功能)
    public  void  paoNiu(){
        System.out.println("学生泡妞...");
    }




}
