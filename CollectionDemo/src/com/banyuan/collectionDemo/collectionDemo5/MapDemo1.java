package com.banyuan.collectionDemo.collectionDemo5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {


    public static void main(String[] args) {

        Map  map=new HashMap();
        map.put(12, 12);
        map.put("你", 12);
        map.put(true, 12);
        map.put("", 12);
        map.put(12.3, 12.3);
        map.put(12.3, 8888);
        map.put(45, "测试");
        map.put(null, "sa");
        map.put("洒水", null);

        map.put(new Person("李四"), new Person("李四老婆"));
        map.put(new Person("李四"), new Person("李四小老婆"));


        Map  map2=new HashMap();
        map2.put("张三", 115);
        map2.put("王麻子", 11);
        map2.put("赵老二", 13);

        //System.out.println(map);

        //System.out.println(map.get(""));
       // System.out.println(map.remove(12.3));
       // map.putAll(map2);

      // Collection  con= map.values();

        Set set=map.keySet();  //获取所有键
        for (Object  o:set) {
            System.out.println("键为:"+o+",值为:"+map.get(o));
        }







    }
}
