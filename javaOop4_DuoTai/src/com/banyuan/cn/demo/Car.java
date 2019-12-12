package com.banyuan.cn.demo;

public class Car {

    private   String   type;
    private   String   brand="Car类brand";
    private   String   color;

    public  String   city="南京...";

    public Car() {
    }

    public Car(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    //汽车行为

    public   void driver(){
        System.out.println("疯狂赛车");
    }

    public  void  cold(){
        System.out.println("制冷");
    }




    public  static    void  method(){
        System.out.println("我是car的静态方法");
    }




}




