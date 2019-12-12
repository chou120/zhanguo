package com.banyuan.cn.Outer.outer2;

public class Outer {

     static  int  number=11231;

    public   static class  Inner{

        private  String address;

        public  static  int age=12;

        public   static   void  show(){
            System.out.println("我是内部类的静态方法..."+number);
        }

        public  void   method(){
            System.out.println("我是静态内部类的普通方法....");
        }


    }

}
