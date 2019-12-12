package com.banyuan.collectionDemo.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {


    public static void main(String[] args) {
        Collection co=new ArrayList();
        co.add("赵信");
        co.add("蛮王");
        co.add("易");
        co.add("剑姬");
        co.add("赵信");
        co.add(123);

        Collection co2=new ArrayList();
        co2.add("赵信");
        co2.add("蛮王");
        co2.add("易");

        co.removeAll(co2);
        System.out.println(co);




    }


}
