package com.banyuan.demo;

public class Person {

    private  String name;
    private  int age;
    private  String  address;

    public  String  city="南京";



    public Person() {

    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

//    public   void  daMaJiang(){
//        System.out.println("父亲打麻将");
//    }

    public void   makeMoney(){
        System.out.println("包工程赚钱");
    }



    private String  password;

    public  void   setPassword(){

    }

    private   void  method(){
        System.out.println("我是父类的私有化方法...");
    }

    public  void   getMethod(){
        method();
    }

    /* 标准类里面：
        普通变量
        普通方法

        构造器


     */







}
