package com.banyuan.api.obj;


public class APIDemo1{

    /**
     * api   application  programming interface
     *
     *
     */

    public static void main(String[] args) throws CloneNotSupportedException {

//        Object   object=new Object();
//        System.out.println(object.getClass());
//
//        System.out.println(object.getClass().getName());
//
//        System.out.println(object.toString());
//
//        Object   object2=new Object();
//
//        System.out.println(object.hashCode());
//        System.out.println(object2.hashCode());
        /*
            1627674070
            1360875712
         */

        Student   stu=new Student();

        stu.setName("李四");

//        Student   su=stu;
//        su.setName("王五");
//
//        System.out.println(">>>>>>>>>>>"+stu.getName());



        Student  s=(Student) stu.clone();  //克隆出另一个对象    跟之前对象不是同一个
        //s.setName("切糕");

        System.out.println(stu.getName()+"---"+s.getName());

        System.out.println(stu.hashCode());//1627674070

        System.out.println(s.hashCode());//1360875712


        Object   obj=new Object();
        Object   obj2=new Object();

       // System.out.println(obj.equals(obj2));
        stu=new Student("王五");
        s=new Student("王五");

        // 写程序  主观业务逻辑分析
        System.out.println(stu.equals(s));




        //写一个程序  用来判断除地址意外的所有的属性是否是一样

        stu=new Student("王五",12);
        s=stu;

        System.out.println(stu.equals(s));//



    }


}



