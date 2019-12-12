package com.banyuan.collectionDemo.collectionDemo2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo2 {

    public static void main(String[] args) {

        List  list=new ArrayList();  //  底层存储是 数组  查询快   增删慢  线程不安全  效率高
        list.add("张三");
        list.add("王五");
        list.add("砖石");
        list.add(1,"雕兄");

        list.add("张三");
        list.add("砖石");

//        for (int i = 0; i <list.size(); i++) {
//            System.out.println(list.get(i));
//        }

       // System.out.println( list.subList(2,3));


     //   list.remove(2);
      //  System.out.println(list);
       // System.out.println(  list.indexOf("砖石"));
        Object  s=  list.set(0, "💰");
        System.out.println(list);
//        System.out.println(s);

        ListIterator it= list.listIterator();

      //  System.out.println(it.previous());
        //System.out.println(it.next());
        //System.out.println(it.previous());
        //System.out.println(it.nextIndex());

        it.add("你好1");
        it.add("你好2");
        it.add("你好3");

        list.add("王文博");

        System.out.println(list);









    }
}




