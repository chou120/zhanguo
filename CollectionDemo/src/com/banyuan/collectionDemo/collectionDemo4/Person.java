package com.banyuan.collectionDemo.collectionDemo4;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparator{

    private  String   uname;
    private  int  age;

    public Person(String uname, int age) {
        this.uname = uname;
        this.age = age;
    }


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(uname, person.uname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uname, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }

    //比较器
    @Override
    public int compare(Object o1, Object o2) {

        return 0;
    }









}
