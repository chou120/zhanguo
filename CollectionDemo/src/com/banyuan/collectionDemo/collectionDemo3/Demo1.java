package com.banyuan.collectionDemo.collectionDemo3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo1 {

    public static void main(String[] args) {

        Set set = new HashSet();  //set 集合特点  底层存储是hash表    无序   数据唯一
//        set.add("年审");
//        set.add(23.5);
//        set.add(12);  //不能以小数据的顺序 就判断set集合是有序的
//        set.add(true);
//        set.add('a');
        set.add(new Person("张三", 12));
        set.add(new Person("张大炮", 12));
        set.add(new Person("张大", 12));
        set.add(new Person("张炮", 22));

//        for (Object  o: set) {
//            System.out.println(o);
//        }

       Iterator  it= set.iterator();

       while (it.hasNext()){
           Person  obj=(Person)it.next();
           //输出集合里面所有的对象的姓名
           System.out.println(obj.getUname());

       }












    }
}
