package com.banyuan.cn.demo4;

public class Test {

    public static void main(String[] args) {
//        Teach  t=new ZhouTeacher();
//        t.setTeacherName("老周");
//        t.teach("javaSE");
//
//         t=new ZhouTeacher();
//        t.setTeacherName("老李");
//        t.teach("javaEE");

      // 接口多态
        Play  p=new ZhouTeacher();
        p.show();
        Play  p1=new Person();
        p1.show();



    }

}
