package com.banyuan.oop1.staticdemo;

public class Demo1 {


    /**
     * static  关键字
     * @param args
     *
     * class文件只会被加载一遍
     * class文件在内存中加载的时候   被static 修饰的成员立即加载    static修饰的成员叫  类成员
     *
     *  static  修饰的成员 优先于对象存在、
     *
     *  static  修饰的成员被所有的对象共享
     *
     *  静态的方法只能调用静态成员
     *  非静态的可以任意调用
     *
     */

    public static void main(String[] args) {
        System.out.println(Person.country);


    }


}
