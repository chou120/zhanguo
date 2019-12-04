package com.banyuan.homework.staticDemo;

public class Tool {

    //  基本类型  char
    //      gbk(gb2113)编码格式 一个汉字 或者一个字符 2个字节
    //      utf-8   编码格式  是  3个字节   _ _ _   ASCII
    //      utf-16  编码格式   一个汉字 占4个字节


    //  引用类型    String   数组     类   接口   等
        static int[] arr=new int[20];
        static int   x=10;

        String city="上海";


        public  void  getInfo(){

            System.out.println(x);
            show();
            System.out.println(city);

        }

        public  static  void show(){

            System.out.println("我是静态方法..."+x);
            method();

           // System.out.println(city);

        }

        public static  void  method(){



        }

















        //需求：在调用Tool类的  成员之前给数组进行初始化,并且只初始化一次
        public   Tool(){
            System.out.println("我是无参构造器...构造方法代码块");
        }

        {

            System.out.println("我是构造代码块");
        }

        // 1.静态代码块  2.构造代码块  3.构造方法代码块  执行顺序

        static{
            for(int i=0;i<20;i++){
                arr[i]=i;
            }
            System.out.println("我是静态代码块...");
        }















}
