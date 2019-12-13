package com.banyuan.collectionDemo.collectionDemo3;

import java.util.LinkedHashSet;

public class Demo2 {


    public static void main(String[] args) {

        LinkedHashSet  linkedHashSet=new LinkedHashSet();
        /*
            底层存储：链表 保证数据的顺序
                    hash表 保证数据的唯一
         */
        linkedHashSet.add("你好1");
        linkedHashSet.add("你好2");
        linkedHashSet.add("你好3");
        linkedHashSet.add("你好4");
        linkedHashSet.add(true);
        linkedHashSet.add("你好5");

        System.out.println(linkedHashSet);




    }


}
