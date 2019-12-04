package com.banyuan.demo;

public class ExtendDemo1 {

       /*
            多个类中如果出线相同的成员  会把相同的成员抽取出来放在一个公共的类里面
            1.当父类和子类拥有共同的成员变量(成员方法)的时候  优先使用子类的自己的变量(方法)
            2.子类不可以继承父类私有化的成员

        */
       /*
           假设Person 父类 有两个方法   打麻将   赚钱

           方法重写（覆盖）： 方法名一样  方法括号里面的参数列表一样  返回值一样
           但是其方法内部的执行方法是不一样

        */
       public static void main(String[] args) {
           Student  stu=new Student();
           stu.makeMoney();
            stu.paoNiu();
        stu.getMethod();

       }






}
