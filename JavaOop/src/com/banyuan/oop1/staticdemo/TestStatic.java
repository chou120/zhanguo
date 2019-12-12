package com.banyuan.oop1.staticdemo;

public class  TestStatic {

    public static void main(String[] args) {
//        Person  p=new Person();
//        System.out.println(p.getName());
//        p.get();
//        p.getShow();
//        p.country="🇺🇸";
//        System.out.println(p.country);
//
//
//        Person  p2=new Person();
//        System.out.println(p2.country);





        /*
            类名.静态方法名
            类名.静态属性
         */

//        System.out.println(Person.country);


//        Person p=new Person();
//        p.get();
//
//        Person p2=new Person();
//
//        Person p3=new Person();

           Person  p=new Person("哈哈哈是");
           p=null;

           /*
            static 修饰的不会一直在   class

            非静态方法如果对象被回收

            非静态的方法 的局部变量在内存中会不会有储存空间

            */



    }

}
