package com.banyuan.packaging;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {


    public static void main(String[] args) {

        //计算机元年  1970年1月1日  8:00:00
        Date   date=new Date();  //从计算机元年开始过去了 1 秒
        long   time=date.getTime();  // 毫秒值

//        System.out.println(date.getMonth()); //    11
//        System.out.println(date.getYear());
//
//        System.out.println(time);
//        System.out.println( System.currentTimeMillis());

        //对时间进行处理的类
        SimpleDateFormat   sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SS毫秒");

       // System.out.println(date);
       String  str= sdf.format(date);

        System.out.println(str);


        str="2019-12-11";

        sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            date=sdf.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 作业2:计算你从出生到现在以及过去多少天多小时


            String  st="he";
            String  st2="he"+"he"+"he"+"he";   //  2

            String  st3="hei";
            String  st4="hei"+"hei"+"hei"+st3;  // 3


    }





}
