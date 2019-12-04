package com.banyuan.demo.demo4;

public class Demo {

    /**
     * 多层继承
     *  A{}     B  extends A  {}     C  extends  B{}
     */
    public static void main(String[] args) {

        Son  son=new  Son();

        son.setName("国家垃圾");

        System.out.println(son.getName());

        son.smoke();


    }



}
