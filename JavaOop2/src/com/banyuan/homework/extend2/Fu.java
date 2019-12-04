package com.banyuan.homework.extend2;

public class Fu {


    String  address="下水道";
    public  String city="南京";

    private  String name="🐸";
    private  int age;
    private   double  height;
    private   double  weight;
    private   char    sex;
    private   String  iphone;

    public Fu() {
        super();
    }
    public Fu(String name, int age, double height, double weight, char sex, String iphone) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.iphone = iphone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("我是父类的...");
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getIphone() {
        return iphone;
    }
    public void setIphone(String iphone) {
        this.iphone = iphone;
    }


    public String show() {
        return "Fu [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", sex=" + sex
                + ", iphone=" + iphone + "]";
    }


    public  void   drink(){
        System.out.println("Fu喝酒");
       // method();
    }

    private  void   majiang(){
        System.out.println("´Fu打麻将");
    }


    private   void  method(){
        System.out.println("这是fu的私有化方法...");
    }






}
