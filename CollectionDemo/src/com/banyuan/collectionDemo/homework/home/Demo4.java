package com.banyuan.collectionDemo.homework.home;

import java.io.UnsupportedEncodingException;
import java.util.TreeSet;

public class Demo4 {

    //    某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，给出所有同学的成绩（可随机产生，范围为 50-100），
    //    请编写程序将本班各位同学成绩从高往低排序打印输出，
    //    注：成绩相同时学号较小的优先打印要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩
    public static void main(String[] args) throws UnsupportedEncodingException {
//        TreeSet  treeSet=new TreeSet();
//        for (int i = 0; i <40; i++) {
//            Student  s=new Student();
//            s.setStuNumer(180201+i);
//            s.setName("同学J"+(i+1));
//            s.setScore((int)(Math.random()*51+50));
//            treeSet.add(s);
//        }
//        for (Object  ob:treeSet) {
//            Student s=(Student)ob;
//            System.out.println(s.toString());
//    }
        String str="我ABC汉DEF";
        System.out.println(getStr(str, 6));


    }

    public static   String  getStr(String  str,int  length) throws UnsupportedEncodingException {
        String   st="";
        byte [] by=str.getBytes("gbk");
        if(length>=by.length){
            st=str;
            return st;
        }
        if(by[length-1]>0){
            st=new String(by,0,length,"gbk");
            return st;
        }

        int key=0;
        for (int i = 0; i < length; i++) {
            if(by[i]<0){
                key++;
                key=key%2;  //key 的值只有 0 或者  1
            }
        }
        st=new String(by,0,length-key,"gbk");
        return  st;
    }
}
