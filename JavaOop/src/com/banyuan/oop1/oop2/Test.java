package com.banyuan.oop1.oop2;

public class Test {

    public static void main(String[] args) {
//        Person  p=new Person();
//        p.setAge(12);
//        p.setName("张三");
//
//       // System.out.println(p.getAge()+","+p.getName());
//     //   p.show();
//        System.out.println(p.toString());
//
//
//
//        Person  p2=new Person();
//        p2.setAge(12);
//        p2.setName("张三");
//
//       // System.out.println(p.getAge()+","+p.getName());
////        p2.show();
//
//        Person  p3=new Person();
//        p3.setAge(12);
//        p3.setName("张三");

        //System.out.println(p.getAge()+","+p.getName());
  //      p3.show();


    //    System.out.println("----"+p.show());

        Person  p=new Person();  //  上面的 这个对象有没有被回收
        p.setAge(12);

        System.out.println(p.getAge());

        p=new Person();//不是同一个对象
        p.setAge(14);


        //对象是怎么创建来的
        p=new Person("李四");
        System.out.println(p.getName());


        p=new Person("阿王八",12);

        System.out.println(p.toString());

        Person  ps=new Person(); //  jvm 对它干了哪些事情
        /*
           1.加在  Person.class
           2.ps
                对象初始化再进行赋值
           3.ps
         */



    }

}
