package com.banyuan.oop1;

public class TestPerson {

    public static void main(String[] args) {
        //测试目标类的属性和方法
        // 类名  变量名=new 类名();
        Person   person=new Person();
        //如何使用类里面 属性和方法
        //变量名.属性    变量名点方法名
//        person.username="李四";
//        //person.age=25;
//        person.height=183;
        person.IDcard="123123";

       // System.out.println(person.username+","+person.IDcard+","+person.height+","+person.age+","+person.sex);
        person.paoniu();

        Person   per=person;
        per.IDcard="1214311221";

        System.out.println(person.IDcard+"---"+per.IDcard);

        System.out.println("-----------------");


        Person  p=new Person();
        //p.username="陈";
  //      p.age=-19;

        System.out.println(p.username+p.IDcard+",");

        p.setAge(-1123);


        System.out.println(p.getAge());




    }


}
