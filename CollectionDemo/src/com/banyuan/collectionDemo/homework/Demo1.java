package com.banyuan.collectionDemo.homework;

import java.util.*;

public class Demo1 {

    // 手动输入一行字符串，去掉其中重复字符，打印出不同的那些字符
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("输入一行字符:");
        String   str=sc.nextLine();

        char  [] ch=str.toCharArray();
        LinkedHashSet   linkedHashSet=new LinkedHashSet();

        for (char c: ch) {
            linkedHashSet.add(c);
        }
        System.out.println(linkedHashSet);

    }
}
