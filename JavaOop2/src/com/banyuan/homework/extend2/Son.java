package com.banyuan.homework.extend2;

public class Son extends Fu {




    //1.子类不能继承父类的所有的私有化成员
    //2.子类如果有父类相同的成员（成员变量和成员方法） 子类的对象用的是自己的成员

    //如果是子类特有的方法 行为

    private String  hobby;//

    private String  name="李四";

    public  String  city="上海";


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
        System.out.println("我是子类的");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public  void   paoNiu(){
        System.out.println("泡妞");
    }






}
