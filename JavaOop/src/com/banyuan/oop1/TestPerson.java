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

//
//        int [] arr=new int[5];   //
           int [] arr2=new int[]{123,1231,4123};
//        int [] ra={1231,213123123,1,312,3,123,12,312,3,1,31,3,12,312,31,23,1};

//          int[][] ar=new int[5][];
//          ar[0]=new int[12];
//          ar[1]=new int[14];
//
//
//        int [][] a=new int[][]{{12,3},{231,1231,123,123141},{4,2},{1}};



        String  str="";


    }


}
