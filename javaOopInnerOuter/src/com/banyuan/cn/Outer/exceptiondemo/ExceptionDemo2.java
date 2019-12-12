package com.banyuan.cn.Outer.exceptiondemo;

public class ExceptionDemo2 {


    /*
        throwable 是程序发生error 和 Exception 的基类
        Exception分类
            编译时异常:  程序在编译期出现错误
                文件:   IO    时间
            运行时异常:  程序在运行时出现错误
                RuntimeException

         如何处理异常:
            1. 抛给虚拟机处理
            2. try{ }catch(xxx e){ }finally{ }
            3. try{ }catch(){ }
            4. try{ }finall{ }

     */


    public static void main(String[] args)  {


      //  System.out.println(1/0);
        int   [] arr=new  int[2];

       try{
           System.out.println(1/2);

           System.out.println("-"+arr[1]);

           System.out.println(arr[4]);

       }catch (ArithmeticException  | NullPointerException | ArrayIndexOutOfBoundsException e){ //1.7以后的新写法
        //  System.out.println(e.getMessage());
        e.printStackTrace();     //将错误的信息打印到文件里面去    io
    //           Exception in thread "main" java.lang.ArithmeticException: / by zero
    //         at com.banyuan.cn.Outer.exceptiondemo.ExceptionDemo2.main(ExceptionDemo2.java:26)

       }

        System.out.println("自己处理的异常 会不会影响程序继续执行...");


    }
}
