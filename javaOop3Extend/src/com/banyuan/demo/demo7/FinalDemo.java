package com.banyuan.demo.demo7;

public    class  FinalDemo {

    /* final  最终
            可以修饰类           该类不能被继承
            可以修饰变量          被final修饰的变量变成常量   常量的值内容不能被改变
            可以修饰方法          被final修饰的方法不能 被重写



            字面值常量    "你好"  2    2.3   true ...

     *
     */
    final   String   NAME="晨家园";


    public  final   void   method(){
        //NAME="定做跟";
        System.out.println(NAME);
    }



    public   void    getShow(final  String username,final  int age){

        //username="你好";
        //age=43;
        System.out.println("姓名:"+username+",年龄:"+age);

    }

    public   void  show2(int [] arr){  //arr int类型在内存中的数组的位置（地址）


    }

    public   void  show(final Person   person){
       // person=new Person("李四");
       // person.setName("秋刀鱼");

        System.out.println("----"+person.getName());

    }
















}
