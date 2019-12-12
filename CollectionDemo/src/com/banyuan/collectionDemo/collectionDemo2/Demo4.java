package com.banyuan.collectionDemo.collectionDemo2;

import java.util.Stack;
import java.util.Vector;

public class Demo4 {

    public static void main(String[] args) {

        Vector  vector=new Vector();  //底层存储是数组  增删慢 查询快  synchronized安全  效率低
        vector.addElement("数据1");
        vector.add("数据2");
        vector.add("数据3");

        vector.setElementAt("马大哈", 1);

        vector.insertElementAt("大保健", 1);

        System.out.println(vector.capacity());

        Object [] o=new Object[vector.size()];
        vector.copyInto(o);
        System.out.println(vector);

        for (Object  obj:o) {
            System.out.println(obj);
        }



    }



}
