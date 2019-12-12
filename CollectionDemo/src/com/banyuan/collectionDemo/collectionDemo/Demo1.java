package com.banyuan.collectionDemo.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

    public static void main(String[] args) {
        /*
            数组:1.相同数据类型的集合  2.长度固定
            集合:存放任意数据类型的并且长度可以改变
         */
        Collection  con=new ArrayList();
        int []arr={12,45,'a'};
        Collection  con2=new ArrayList();


        con.add("zhangsan");
        con.add("李四");
        con.add(12);
        con.add(true);
        con.add(12.3);
      //  con.add(true);
        con.add('a');
        con.add(arr);
        con.add(new Person("王五"));

        con2.add("zhangsan");
        con2.add("李四");
        con2.add(12);
        con2.add(true);

       // con.add(con2);

       // con.clear();
        System.out.println(con.isEmpty());
      //  System.out.println(con);

      //  con.remove(true);  //默认移除第一个true
        //con.remove(con2);

       // System.out.println( con.contains(true));

      //  con2.retainAll(con);

        System.out.println(con.containsAll(con2));

        System.out.println(con);
        System.out.println(con2);

//        System.out.println();
//        Object[] obj= con.toArray();
//        for (int i = 0; i < con.size(); i++) {
//            System.out.println(obj[i]);
//        }



    }


}
