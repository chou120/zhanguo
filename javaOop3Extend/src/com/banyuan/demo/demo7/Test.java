package com.banyuan.demo.demo7;

public class Test {

    public static void main(String[] args) {
        //  匿名对象    没有名字的对象    new   类名();
        new Son().method();  // 匿名对象作用  使用一次就被垃圾回收  不占用内存
        //链式书写

        //new  Son().getShow("李四", 12);


        String  name="nhao";  //常量池

        Person   p=new Person("王五");

        new Son().show(p);




    }


}
