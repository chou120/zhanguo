package com.banyuan.cn.demo;

public class QQ  extends Car {

    private  String  address;//国内生产

    public  String  city="上海";  // 如果说 这个属性 或者 某个方法是子类特有的  父类必须要去访问...

    private   String   brand="QQbrand";


    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public QQ(String address) {
        this.address = address;
    }

    public QQ() {
    }

    //qq有自己的特异功能
    public   void  changeColor(){

        System.out.println("随着速度不同,颜色不一样...");

    }

    public   void driver(){
        System.out.println("半自动驾驶...");
    }




    public  static    void  method(){
        System.out.println("我是QQ的静态方法");
    }

    public void ma(){
        System.out.println("这是QQ特有的方法...");
    }



}
