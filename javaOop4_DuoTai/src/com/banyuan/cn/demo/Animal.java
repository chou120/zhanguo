package com.banyuan.cn.demo;

public class Animal {

    private   String   animalName;
    private   int   age;

    public Animal(String animalName, int age) {
        this.animalName = animalName;
        this.age = age;
    }

    public Animal() {
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", age=" + age +
                '}';
    }


    //
    public   void  eat(){
        System.out.println(this.animalName+"在进食");
    }

    public  void   sleep(){
        System.out.println(this.animalName+"在睡觉");
    }





}
