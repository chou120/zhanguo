package com.banyuan.exceptionDemo1;

public class ExceptionDemo2 {


    public static void main(String[] args) {
        System.out.println(show());
    }

    public  static  int  show(){  //x  y
        int  a=10;
        int  b=7;
        try{
            System.out.println("-----"+a/0);
            b=2;
        }catch (Exception  e) {
            b=9;   //1
           return b; //   4 不走
        }finally {
            b=40;  //  2
            return b; //3
        }
    }
}
