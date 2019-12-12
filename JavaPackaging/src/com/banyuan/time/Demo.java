package com.banyuan.time;

import java.util.Calendar;

public class Demo {


    public static void main(String[] args) {

        Calendar  calendar=Calendar.getInstance();
       // System.out.println(calendar);
        System.out.println(calendar.getTime()); //new  Date();
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.getWeekYear()); // 表示这周的年份
        //System.out.println(calendar.getTimeZone());
        calendar.add(Calendar.DATE,3); //表示过去了三天
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, -5);
        System.out.println(calendar.getTime());

        //calendar.add(Calendar.MONTH, -4);
        System.out.println(calendar.getTime());


        System.out.println(calendar.get(Calendar.MONTH)+1);

        calendar.set(2018, 10, 10);

        System.out.println(calendar.getTime());


    }




}
