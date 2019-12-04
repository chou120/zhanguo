package com.banyuan.demo.demo2;

public class Son extends Fu {

    public    String  usename="子类";

    public Son() {
        super();//括号里面没有参数  代表访问父类的无参构造器
        System.out.println("这是子类的无参构造...");
    }

    public   Son(String  usename){
       // super("鸟蛤");
        this.usename=usename;
    }
        /*
            this
            super
         */

    public   void   getShow(){
        System.out.println("son的usename："+usename);
    }

    public  void  get(){

        super.setName("哈哈哈");

        System.out.println(getName());

    }








}
