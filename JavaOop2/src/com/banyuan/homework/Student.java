package com.banyuan.homework;

public class Student {

    private  int  stuNumber;
    private  String stuName;
    private  int  age;
    private   int  gradeClass;
    private   double score;

    public Student() {
    }

    public Student(int stuNumber, String stuName, int age, int gradeClass, double score) {
        this.stuNumber = stuNumber;
        this.stuName = stuName;
        this.age = age;
        this.gradeClass = gradeClass;
        this.score = score;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(int gradeClass) {
        this.gradeClass = gradeClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNumber=" + stuNumber +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                ", gradeClass=" + gradeClass +
                ", score=" + score +
                '}';
    }
}
