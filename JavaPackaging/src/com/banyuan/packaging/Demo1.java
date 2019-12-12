package com.banyuan.packaging;

public class Demo1 {


    public static void main(String[] args){
      //  byte  short  int        long  float  double  boolean  char
      //  Byte  Short  Integer    Long   Float  Double  Boolean   Character

        String   str="12342";
        int  num=34;

        //数据求和
        //将数字字符串转换成数字
        Integer  i=new Integer(str);  // str 装箱
        int  n=i.intValue();  //将  i 拆箱
        System.out.println(n+num);

       // i=new Integer(num);

        Integer   a=213;  //自动装箱和拆箱
        System.out.println(a+num);

        boolean  flag=Character.isDigit('2');//判断该字符是否是数字字符
        System.out.println(flag);







    }

}
