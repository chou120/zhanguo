package com.banyuan.oop1.oop2;

public class Person {


    //标准封装类
    private  String name;
    private   int age;

    /*
     * java每个类都会有构造器  创建对象   当类里面没有显示写出构造函数的时候  jvm 会自动提供一个构造器
     * @param age
     */
    public  Person(){  //无参构造器

        System.out.println("无参构造器创建对象了...");
    }

    public  Person(String name){
        this.name=name;
        System.out.println("只有name构造");
    }

    public  Person(int  age){
        this.age=age;
        System.out.println("只有age构造");
    }

    public Person(String name,int  age){
        this.name=name;
        this.age=age;
        System.out.println("满足所有参数的构造器");
    }





    public   void  setAge(int  age){  //值传递
        this.age=age;  //this  表示当前对象
       // System.out.println(this.hashCode());  //hash码值    用来标识数据再内存存储位置   哈希码值是十六进制的
    }

    public  int  getAge(){
        return   age;
    }

    public   void   setName(String  name){
        this.name=name;
    }

    public  String   getName(){
        return  name;
    }

    //抽取相同的代码
//    public  String   show(){
//        return  getAge()+","+getName();
//    }


    @Override
    public String toString() {
        return getAge()+","+getName();
    }

    /**
     * 局部变量是随着方法的消失而消失
     * 全局变量随着对象的创建而存在  随着对象的消失而消失
     *
     * jvm  垃圾回收机制     当前的占用内存的数据不再被使用的时候 会自动当成垃圾回收
     *
     *
     */


    //方法重载   方法名一样  参数列表不一样  跟方法返回值没有关系
    public  void   method(){

    }
    public  int    method(int age,int x){
        return   age+x;
    }

    public  double   method(float   d,int x,int y){

        return  d+x+y;
    }

    public  String   method(float   d,int x,int y,int  z){
        return  null;
    }















}
