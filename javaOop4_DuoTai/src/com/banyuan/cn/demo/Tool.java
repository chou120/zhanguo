package com.banyuan.cn.demo;

public class Tool {



    //对大众汽车进行改装
//    public   static  void  change(DaZhong  daZhong){
//
//        System.out.println("对"+daZhong.getBrand()+"进行改装");
//
//    }
//
//    //对qq汽车进行改装
//    public   static  void   change(QQ qq){
//        System.out.println("对"+qq.getBrand()+"进行改装");
//
//    }
//
//    //对卡车进行改装
//    public  static    void  change(KaChe  kaChe){
//        System.out.println("对"+kaChe.getBrand()+"进行改装");
//    }


    public   static  void  change(Car  car){ // Car  car=new  QQ();

       // System.out.println("对"+car.getBrand()+"进行改装");
        if(car instanceof QQ){  //  判断car 对象是不是 QQ类型的对象
            System.out.println("对qq"+car.getBrand()+"进行改装");
        }else  if(car  instanceof KaChe){
            System.out.println("对卡车"+car.getBrand()+"进行改装");
        }else{
            System.out.println("对"+car.getBrand()+"进行改装");
        }




    }



}
