package com.banyuan.cn.Outer;

public class Test {


    public static void main(String[] args) {

        OuterDemo1  outerDemo1=new OuterDemo1();
        outerDemo1.methodInfo();

        //创建一个内部类的对象

        OuterDemo1.Inner    oi=new OuterDemo1().new Inner();
        oi.method2();
        oi.show();


        OuterDemo1.Inner2  oi2=new OuterDemo1().new Inner2();
        oi2.show();






    }


}
