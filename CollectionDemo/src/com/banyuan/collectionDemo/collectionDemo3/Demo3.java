package com.banyuan.collectionDemo.collectionDemo3;

import java.util.TreeSet;

public class Demo3 {


    public static void main(String[] args) {

        TreeSet  treeSet=new TreeSet();
        /*
            排序 和唯一性
            底层存储是红黑树(平衡树)
         */
//        treeSet.add(1231);
//        treeSet.add(31);
//        treeSet.add(12);
//        treeSet.add(121);
//        treeSet.add(12);
//        treeSet.add(1);

     //   System.out.println(treeSet);
//        treeSet.add("周3");
//        treeSet.add("周2");
//        treeSet.add("周4");
//        treeSet.add("周7");
//        treeSet.add("周5");
//        treeSet.add("周1");
//        treeSet.add("周6");

      //  System.out.println(treeSet);

        //创建对象    如果年龄一样根据名字来排序
        treeSet.add(new Person("bcd", 12));
        treeSet.add(new Person("qgd", 12));
        treeSet.add(new Person("bdcd", 22));
        treeSet.add(new Person("acd", 123));
        treeSet.add(new Person("bacd", 22));
        treeSet.add(new Person("qcd", 11));


        for (Object  ob:treeSet) {
            System.out.println(ob);
        }



    }


}
