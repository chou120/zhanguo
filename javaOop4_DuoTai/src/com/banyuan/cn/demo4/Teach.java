package com.banyuan.cn.demo4;

public   abstract    class Teach {

    private  String  teacherName;
    private  int     age;

    public Teach() {
    }

    public Teach(String teacherName, int age) {
        this.teacherName = teacherName;
        this.age = age;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public   abstract  void  teach(String  projectName);

    public  abstract   void  driver();

    public   abstract   void  eat();

    //为了满足 1.给子类添加额外的功能    2.降低类与类之间的耦合度   ------> 接口诞生了....


}
