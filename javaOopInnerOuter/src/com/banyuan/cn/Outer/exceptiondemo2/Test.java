package com.banyuan.cn.Outer.exceptiondemo2;

public class Test {

    public static void main(String[] args) {

//        Inner  inner=new InnerImpl();
//
//        inner.get();


        new Inner(){
            @Override
            public void get() throws ArithmeticException {

            }
        };


    }
}
