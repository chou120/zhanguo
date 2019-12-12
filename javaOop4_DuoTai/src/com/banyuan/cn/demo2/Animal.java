package com.banyuan.cn.demo2;

public abstract class Animal {

     public    String  name="动物";

    public Animal() {
        System.out.println("这是抽象类的Animal构造器....");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  getShow(){
        System.out.println("我是抽象类里面的普通方法....");
    }

    //父类里面的方法没有一个具体的实现   具体的实现是靠子类的实现

    public  abstract   void   sleep();




}
