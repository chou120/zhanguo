package com.banyuan.collectionDemo.homework;

public class Course {

    private int  cid;
    private String cname;

    public Course(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Course(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Course() {
    }


    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public static class Demo4 {

    //    某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，
    //    给出所有同学的成绩（可随机产生，范围为 50-100），
    //    请编写程序将本班各位同学成绩从高往低排序打印输出，
    //    注：成绩相同时学号较小的优先打印要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩

        public static void main(String[] args) {



        }




    }
}
