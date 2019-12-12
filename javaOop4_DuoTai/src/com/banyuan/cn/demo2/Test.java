package com.banyuan.cn.demo2;

public class Test {


    public static void main(String[] args) {

        Animal   animal=new Dog();
        animal.setName("dog");
        animal.sleep();

        System.out.println(animal.name);

        Tool.AnimalSleep(animal);

        animal=new Elephant();
        animal.sleep();


        //Animal   animal1=new  Animal();//抽象类不可以创建对象













    }


}
