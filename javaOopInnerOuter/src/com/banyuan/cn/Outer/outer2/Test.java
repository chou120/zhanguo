package com.banyuan.cn.Outer.outer2;

public class Test {

    public static void main(String[] args) {

        Outer.Inner oi=new Outer.Inner();//
        oi.method();

        System.out.println(Outer.Inner.age);



    }
}
