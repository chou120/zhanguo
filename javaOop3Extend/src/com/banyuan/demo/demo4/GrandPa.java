package com.banyuan.demo.demo4;

public class GrandPa {

    private  String name="国家英雄";
    private  String honor="一等军功英雄";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GrandPa() {
    }

    public GrandPa(String name) {
        this.name = name;
    }


    private void war(){
        System.out.println("爷爷打过战...");
    }

    public   void  smoke(){
        System.out.println("烟斗抽烟...");
    }


}
