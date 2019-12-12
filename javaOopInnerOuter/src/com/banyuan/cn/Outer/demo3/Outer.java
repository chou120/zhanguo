package com.banyuan.cn.Outer.demo3;

public class Outer {

//    public static  Inter   method(){
//        return   new   Inter(){
//            @Override
//            public void show() {
//                System.out.println("HelloWorld");
//            }
//        };
//    }


    public  static  Inter  method(){
      //  Inter  i=new InterImpl();
        return    new  Inter(){
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }

}
