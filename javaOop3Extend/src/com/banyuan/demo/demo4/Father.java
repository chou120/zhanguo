package com.banyuan.demo.demo4;

public class Father extends  GrandPa {



    public  void  money(){
        System.out.println("father能赚钱...");
    }
    //有GrandPa
    //抽烟

    public   void  smoke(){
        System.out.println("包装类烟...");
    }

    //静态方法 会不会被继承？  不会   案例在后面 多态
    //如果子类父类有相同的静态方法 那么该静态方法会不会被重写
    // 静态方法 不存在继承或者被重写  因为静态方法属于类方法




}
