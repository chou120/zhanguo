package com.banyuan.collectionDemo.collectionDemo5;

import java.util.*;

public class MapDemo2 {

    public static void main(String[] args) {

        // 把集合当成键
        Map  map=new HashMap();

        List  list=new ArrayList();
        list.add("王族");
        list.add(12);

        Map  map1=new HashMap();
        map1.put("123", 45);
        map1.put("12", 2312);

        map.put("字符串1号",list);
        map.put(new Person("李四"), map1);

        Set  set=map.keySet();
        for (Object o:set) {
            System.out.println("键是:"+o+",值是:"+map.get(o));
        }





    }


}
