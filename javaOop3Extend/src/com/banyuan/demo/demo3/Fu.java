package com.banyuan.demo.demo3;

public class Fu {

    private   String  name="父类的名字";
    private   String  city="父类的城市";


    public Fu() {
    }

    public Fu(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Fu{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
