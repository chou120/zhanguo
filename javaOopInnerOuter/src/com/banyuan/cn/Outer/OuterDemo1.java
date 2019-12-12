package com.banyuan.cn.Outer;

import com.sun.media.jfxmediaimpl.HostUtils;

public class OuterDemo1 {
    /**
     *  什么叫内部类？  在类的内部 有一个类   这个内部类就是一个外部类的普通成员
      */
    private   String   name;

    public  void  methodInfo(){
        //如果在外部类的方法里面去访问内部类的方法  如何访问
        new Inner().method();

        System.out.println("我是外部类的methodInfo方法...");
    }


    public   class  Inner extends FatherOne{
        private   int age;
        public String  address;

        public   void   method(){
            System.out.println("我是内部类的method方法" +name);
            methodInfo();

        }

        public    void  method2(){
            System.out.println("我是内部类的静态方法");
        }

        @Override
        public void show() {
            System.out.println("我是 Inner的show方法");
        }
    }


    public  class  Inner2 extends FatherTwo{
        @Override
        public void show() {
            System.out.println("我是 Inner2的show方法");
        }
    }


    // 局部内部类
    public   String    info(){
        int i=12;  //如果在局部方法里面对局部内部类提供的局部变量是 常量  被final
        class Inner3{
            public  String  test(){
                System.out.println("做了.....");
                return "撒大声地";
            }
        }

       Inner3  i3=new Inner3();
       String   str= i3.test();

       return "addasda";
    }





}
