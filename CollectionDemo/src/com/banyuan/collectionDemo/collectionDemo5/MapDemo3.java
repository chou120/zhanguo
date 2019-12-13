package com.banyuan.collectionDemo.collectionDemo5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo3 {


    public static void main(String[] args) {
//        TreeMap   treeMap=new TreeMap();
//        treeMap.put("niaho1", "展示给你");
//        treeMap.put("niaho2", "展示给你");
//        treeMap.put("niaho3", "展示给你");
//        treeMap.put("niaho4", "展示给你");
//        treeMap.put("niaho5", "展示给你");
//
//       Set  set= treeMap.keySet();
//
//       System.out.println(treeMap.firstKey());

//        Hashtable  hashtable=new Hashtable();  //java.lang.NullPointerException
//        hashtable.put("ass",null);  //  java.lang.NullPointerException
//
//        System.out.println(hashtable);


        /**
         * Hashtable 和 HashMap的区别：
         *  前者不支持键值对为null 否则空指针异常
         *      前者是线程安全的 效率低
         *      后者线程不安全  效率高
         *
         * hashMap的实现原理
         *          key  value
         *  java.util.concurrent.ConcurrentHashMap
         *
         *
         */

        /*
            abcabswdawdasaasdwd    获取字符串里面每个字符出现的次数
            要求输出的结果是:  a(3)b(3)c(1)...
         */

        String  str="abcabswdawdasaasdwd";
        TreeMap  treeMap=new TreeMap();

        for (int i = 0; i < str.length(); i++) {
            char  c=str.charAt(i);
            Object k=treeMap.get(c);  //k 用来统计次数
            if(k==null){  //k 表示值
               treeMap.put(c,1);
            }else{
                Integer  j=(Integer)k;
                ++j;
                treeMap.put(c,j);
            }
        }

        System.out.println(treeMap);







    }


}
