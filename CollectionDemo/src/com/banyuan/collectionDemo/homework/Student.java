package com.banyuan.collectionDemo.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int  num;
    private String  name;
    private List  list;  //学生所选课程

    public Student() {
        list=new ArrayList();
    }
    public Student(int num, String name) {
        this.num = num;
        this.name = name;
        list=new ArrayList();
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public   void  addCourse(Course  course){
        list.add(course);
    }
    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
