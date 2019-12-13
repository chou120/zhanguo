package com.banyuan.collectionDemo.homework.home;

import com.banyuan.collectionDemo.homework.Course;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable {
    private int stuNumer;
    private String name;
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int stuNumer, String name, double score) {
        this.stuNumer = stuNumer;
        this.name = name;
        this.score = score;
    }

    public Student(int stuNumer, String name) {
        this.stuNumer = stuNumer;
        this.name = name;
    }

    public Student() {
    }

    public int getStuNumer() {
        return stuNumer;
    }

    public void setStuNumer(int stuNumer) {
        this.stuNumer = stuNumer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNumer=" + stuNumer +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;

        double num = s.getScore() - this.score;
        double num2 = num == 0 ? this.stuNumer - s.getStuNumer() : num;
        return (int) num2;
    }
}
