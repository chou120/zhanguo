package com.banyuan.oop1.pojo;

public class Car {
    //    2.现有汽车类    Car   型号   汽车名   颜色    生产日期  制造商   等
//    如: 奔驰   大奔s300     黑色     2019-10-20  made in china
//            有不同的汽车存储在汽车仓库里面
//    输入要买的汽车型号,卖出去的车从仓库移除该车记录，如果有不同的人来买一样的车子呢


    private  String  carType;
    private  String  carName;
    private  String  color;
    private  String  date;
    private  String  mader;

    public Car() {


    }

    public Car(String carType, String carName, String color, String date, String mader) {

        this.carType = carType;
        this.carName = carName;
        this.color = color;
        this.date = date;
        this.mader = mader;

    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {

        this.carType = carType;

    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMader() {
        return mader;
    }

    public void setMader(String mader) {
        this.mader = mader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", carName='" + carName + '\'' +
                ", color='" + color + '\'' +
                ", date='" + date + '\'' +
                ", mader='" + mader + '\'' +
                '}';
    }
}
