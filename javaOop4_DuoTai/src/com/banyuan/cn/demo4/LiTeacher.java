package com.banyuan.cn.demo4;

public class LiTeacher extends  Teach {
    @Override
    public void teach(String  projectName) {  //如果是实现方式不一样  重写写一个子类
        System.out.println(super.getTeacherName()+"在教"+projectName);
    }

    @Override
    public void driver() {

    }

    @Override
    public void eat() {

    }
    //额外功能  李老会赚钱



}
