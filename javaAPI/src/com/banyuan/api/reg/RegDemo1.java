package com.banyuan.api.reg;

import javax.swing.plaf.synth.Region;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo1 {
    public static void main(String[] args) {
        /*
           什么叫正则表达式?  是一种描述字符的模式的 字符是否符合指定格式
            [a-z] 匹配小子字符
             [A-Z] 大写字符...
             [0-9] 匹配数字
             X{n,} 至少匹配 n个 最多无限匹配
             X{n,m} .......  最多匹配m个
             X* 表示至少匹配零个 最多匹配无限
             X+ 至少匹配一个  ....
             X{n} 必须匹配n次
             . 表示除换行符以外的任意字符
             \w 匹配字⺟母或数字或下划线
             \W 取 \w 的反
             \d  匹配数字
             \D  匹配非数字
             ^ 表示以什么开始
             $ 表示以什么结束
         */

        //  http://www.baidu.com
        String   reg="[h][t]{2}[p](://)[w]{3}\\.[a-z]{3,9}\\.com";
        String   str="http://www.baidu.com";

      //  str="\\\\\\\\";  //windows 系统   \   \\\\     \\     \\\\\\\\
        reg="[a-z]{3}\\\\[a-z]{2}";
        str="nih\\ss";

        //匹配邮箱
        //匹配手机号码
      //  str="+8615256597498";  // 1(3 5 6 7 8 9)\d{9}
        //reg="^(\\+86)?[1][356789]\\d{9}$";

        str="aaAdsadBsdAasdwqBawAsB";
        reg="A.+?B"; //贪婪模式 会从A 开始找 直接到B结束

        //正则表达式的非贪婪模式和贪婪模式
        Pattern p= Pattern.compile(reg);
        Matcher m=p.matcher(str);
        if(m.find()){
            System.out.println(m.group(0));
        }



    }
}
