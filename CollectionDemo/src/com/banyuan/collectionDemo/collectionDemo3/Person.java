package com.banyuan.collectionDemo.collectionDemo3;

import java.util.Objects;

public class Person  implements Comparable{


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

    @Override
    public int compareTo(Object o) {
        //只需要判断当前对象的各个属性和传递过来的 o对象的属性进行比较 就行
        Person p=(Person)o;
        int  num=this.age-p.getAge();
        int  num1=    num==0? this.uname.length()-p.uname.length():num;
        int num2=  num1==0 ? this.uname.compareTo(p.uname):num1;

        return num2;
    }
}
