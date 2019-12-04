package com.banyuan.demo.demo5;

public class A {

    private   static  int    age=10;

    public    void  show(int  age){

        age++;

        System.out.println(age);

    }

    public static void main(String[] args) {
        A   a=new  A();
        a.show(12);

    }

}
