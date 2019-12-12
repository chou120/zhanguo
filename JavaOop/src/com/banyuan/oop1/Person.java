package com.banyuan.oop1;

public class  Person {

    //只要对象一旦创建 类里面的属性就属于堆内存的
    //姓名
    String  username="张三";
    //年龄
    private int  age=24;
    //身高
    double  height;
    //体重
    double  weight=56.7;
    //身份证号  ...
    String  IDcard="13212312123X";
    char  sex;


    public  void  setAge(int   newage){
       if(newage>0 && newage<150){
           age=newage;
       }else {
           System.out.println("年龄违法...");
       }
    }

    public  int   getAge() {
        return age;
    }

    public  void  eat(){
        System.out.println(username+"在吃饭");
    }
    public   void   paoniu(){
        System.out.println(username+"在泡妞");
    }
    public   void   sleep(){
        System.out.println(username+"在睡觉... ");
    }





}
