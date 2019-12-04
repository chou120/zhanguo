package com.banyuan.homework.staticDemo;

public class StaticDemo {

    /**
     * static  静态关键字  可以用来修饰  变量 也可以用来修饰方法
        1.static 修饰的成员被类的所有对象共享    用法：如果在确定某个资源被共享的情况下  可以使用static
        2.static 优先于对象存在
        3.static 修饰的方法可以调用 静态方法和静态变量 不能调用非静态的变量
          非静态方法也可以调用静态属性和静态方法  也可以调用非静态属性
        静态方法里面不能有 this 关键字
        private  和static  尽量不要混用 没有意义

     */
    //实例变量
     private String  name="赵无极";
     private int  age=12;

    private  static  String country="中国";
    public  String  address="南京市 栖霞区 紫东创意园区B9";


      public  StaticDemo(){
          System.out.println("我是无参构造器");
      }

        //如果实例变量被隐藏起来 实例变量当前所在的类 要提供一个对外访问的公共方法
        public  void   set(String   name){
          this.name=name;
        }




        public  void    get(){
            System.out.println(this.name);
        }







}
