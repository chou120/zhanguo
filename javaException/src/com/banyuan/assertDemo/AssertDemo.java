package com.banyuan.assertDemo;

public class AssertDemo {

    /**
     * 什么叫做断言？ 断言主要用做  测试和开发用的    对于一些关键的数据进行判断
     * 如果条件成立 程序停止
     * 如果条件不成立  继续执行
     *
     */
    public static void main(String[] args) {

        int  num=20;
        assert  num==30:"num并不是30";  // java 默认是关闭断言的
        System.out.println(num);

        //现在断言基本上没人用   连jvm停止了   现有一个 junit 测试框架    基本已经占用了assert生存空间


    }







}
