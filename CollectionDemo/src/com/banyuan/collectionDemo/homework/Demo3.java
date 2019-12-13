package com.banyuan.collectionDemo.homework;

public class Demo3 {

//    1.模拟在校学生选课系统,使用集合完成
//    要求：1.学生类:学号，姓名，所选课程Set<Course>
//            学生可以对课程做增删改查操作
//    2.课程类：编号 课程名称
//    3.学生选课清单类
//    完成:有n个人 显示出每个人所选的课程信息
//    如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等

    public static void main(String[] args) {

        Course  course1=new Course(9527,"java");
        Course  course2=new Course(9528,"JS");
        Course  course3=new Course(9529,"python");
        Course  course4=new Course(9530,"php");
        Course  course5=new Course(9531,"C");

        Student  student=new Student(9999,"周星星1");
        student.addCourse(course1);
        student.addCourse(course2);

        Student  student2=new Student(9993,"周星星2");
        student2.addCourse(course3);
        student2.addCourse(course4);



        Student  student3=new Student(9991,"周星星3");
        student3.addCourse(course5);


        Tool.list.add(student);
        Tool.list.add(student2);
        Tool.list.add(student3);


        for (Object  ob:Tool.list) {
            Student st=(Student) ob;
            System.out.println(st.toString());
//            for (Object  o:st.getList()) {
//                Course c=(Course)o;
//                System.out.println(c.toString());
           // }
        }




    }


}
