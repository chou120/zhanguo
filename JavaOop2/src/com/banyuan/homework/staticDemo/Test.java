package com.banyuan.homework.staticDemo;

import com.sun.codemodel.internal.fmt.JStaticFile;

public class Test {

    /**
     * 测试类
     * @param args
     */
    public static void main(String[] args) {
        //如何方法类里面的实例变量
        //创建相应类的对象
//        StaticDemo  staticDemo=new StaticDemo();   // 通过无参构造器来创建对象
//       // staticDemo.name="张三李四";
//        //System.out.println(staticDemo.name);
//        staticDemo.set("王八蛋");
//        staticDemo.get();
//        staticDemo.address="下水道";
//
//        //StaticDemo.country="美国";
//        //staticDemo.country="英国";
//
//        //静态变量的调用   类名.属性名
//      //  System.out.println("我是"+StaticDemo.country);
//        System.out.println(staticDemo.address); //下水道
//
//        StaticDemo  staticDemo2=new StaticDemo();
//        StaticDemo  staticDemo3=new StaticDemo();
//
//        System.out.println(staticDemo2.address); //紫东
//        System.out.println(staticDemo3.address); //紫东



//            int [] array=Tool.arr;
//            int    x=Tool.x;
     //   Tool.x=12;

    //   System.out.println(Tool.x);
//        System.out.println(Tool.x);
//        System.out.println(Tool.x);

//        Tool  tool1=new Tool();
//
//        Tool  tool2=new Tool();
//
//        Tool  tool3=new Tool();

//        int z=Tool.x;  //
//
//        int z1=Tool.x;
//
//        int z2=Tool.x;


        int [] array=Tool.arr;
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }

        int  [] a=Tool.arr;
        a[5]=15;

        for (int i = 0; i <Tool.arr.length; i++) {
            System.out.print(array[i]+" ");
        }
        get();




    }

    public  static void  get(){
        System.out.println(Tool.arr[5]);
    }




}
