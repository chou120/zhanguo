package com.banyuan.demo.demo2;

public class Fu {

    public  String  name="子类";

    public Fu() {
        System.out.println("这是父类无参构造器...");
    }

    public Fu(String name) {
        this.name = name;
        System.out.println("这是父类有参构造器..."+name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fu{" +
                "name='" + name + '\'' +
                '}';
    }
}
