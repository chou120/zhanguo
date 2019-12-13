package com.banyuan.collectionDemo.homework;

import java.util.TreeSet;

public class Demo2 {

//     在一个列表中存储以下元素：apple,grape,banana,pear
//            返回集合中的最大的和最小的元素
//            将集合进行排序，并将排序后的结果打印在控制台上
    public static void main(String[] args) {
        TreeSet   treeSet=new TreeSet();
        treeSet.add("apple");
        treeSet.add("grape");
        treeSet.add("banana");
        treeSet.add("pear");

        System.out.println("banana".compareTo("pear")+"=="+compareTo("banana","pear"));

        System.out.println(treeSet);

    }


    public static int compareTo(String   str1,String str2) {
        char [] value=str1.toCharArray();
        char [] val=str2.toCharArray();
        int len1 = value.length;
        int len2 = val.length;
        int lim = Math.min(len1, len2);
        char v1[] = value;
        char v2[] = val;

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }







}
