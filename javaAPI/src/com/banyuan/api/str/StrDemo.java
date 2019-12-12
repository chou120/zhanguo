package com.banyuan.api.str;

public class StrDemo {

    public static void main(String[] args) {
        String str="你好大保健";  //  str 栈空间    "你好大保健" 在常量池里面

      //  str=str+"我的剑"; //请问str指向的 常量池里面的"你好大保健" 内容变了没有
        String  str1="你好大保健";

        System.out.println(str.hashCode()+"---"+str1.hashCode());
        System.out.println(str==str1);

        String   st=new String("大保健");  //请问  st 在内存中什么位置
        String   st2=new String("大保健");

        System.out.println(st.equals(st2)); // true
        System.out.println(st==st2); // false

        String  s="hello";
        String  s1=new String("hello");
        // 99162322====99162322
        System.out.println("hello".hashCode()+"===="+s.hashCode());

        System.out.println(s.equals(s1)); // true
        System.out.println(s==s1); // false

        System.out.println(">>>>>>"+s1);

        String  s2="hel"+"lo";
        System.out.println(s.equals(s2));  //true
        System.out.println(s==s2); //true


        String  t1="hello";
        String  t2="world";
        String  t3="helloworld";

        String  t4=t1+t2+t3;
        //编译之后的：  new  StringBuilder(String.valueOf(t1)).append(t2).toString():

        System.out.println(t3==t4);  //
        System.out.println(t3.equals(t1+t2)); //true


        String   string=new String("你好");//创建了几个对象
        String   str6="h"+"e"+"l"+"l"+"o";







    }



}
