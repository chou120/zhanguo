package com.banyuan.demo.demo5;

public class Son extends  Fu{
    public  int   num=15;
    public  Son(){
        super();   //Fu.class    Son.class        new  Son()
        System.out.println("子类构造方法代码块....");//  6
    }

    static{
        System.out.println("子类静态代码块");// 2
    }

    {
        System.out.println("子类构造代码快....");//  5
    }












    public   void  show(){
        int  num=20;
        System.out.println(num); //20
        System.out.println(this.num);    // 15
        System.out.println(super.num);
    }

}
