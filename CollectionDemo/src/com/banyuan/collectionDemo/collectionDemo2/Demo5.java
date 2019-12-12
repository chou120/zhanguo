package com.banyuan.collectionDemo.collectionDemo2;

import java.util.Stack;
import java.util.Vector;

public class Demo5 {

    public static void main(String[] args) {

        Stack  stack=new Stack(); // 底层存储是数组  增删慢 查询快  synchronized安全  效率低
        //stack.setSize(6);
        stack.add("陈家园1");
        stack.add("陈家园2");
        stack.add("陈家园5");
        stack.add("陈家园3");
        stack.add("陈家园4");
        stack.add("陈家园5");

        stack.push("入栈");
        stack.pop();

        System.out.println( stack);


    }



}
