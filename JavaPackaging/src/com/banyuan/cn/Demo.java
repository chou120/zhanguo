package com.banyuan.cn;

import jdk.nashorn.internal.runtime.regexp.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
        /*
           synchronized 线程安全的
           StringBuffer   线程安全的   运行速度慢 效率低    内容可改变
           StringBuilder   线程不安全但是运行速度快 效率高   内容可改变
         */
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(23);

        //作业:写一个案例验证  String定义的字符串不可变    StringBuffer的字符串可变
        String reg = "a.+?d";
        String str = "esrydadasdasdqwvda";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println(m.group(0));
        }

    }


}
