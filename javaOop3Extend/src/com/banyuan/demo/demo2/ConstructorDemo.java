package com.banyuan.demo.demo2;

public class ConstructorDemo {

    /**
     * 分析构造器
     *
     * 1.子类可不可以 继承父类 无参构造器
     * 继承的好处:  1.提高了代码的复用性   2.易于维护
     *     坏处: 1.打破了父类的封装性    2.类于类之间的关系加深 耦合度变高
     *
     *
     *     高内聚 如果一个类能单独完成所有的功能不需要借助其他的类来完成 那就叫高内聚
     *     低耦合
     */


    public static void main(String[] args) {

        Son  son=new  Son("张三");

        son.usename="你们觉得改变没有";

        System.out.println(son.usename);




    }





}
