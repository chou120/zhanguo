package com.banyuan.cn.Outer.demo;

public class Test {

    public static void main(String[] args) {
//        Teach  teach=new TeachImpl();
//        teach.show();

       Teach  in= new  Teach(){
              @Override
              public void show(String  address) {
                  System.out.println("陈家园..."+address);
              }

              @Override
              public void show2(String address) {

              }

              @Override
              public void show3(String address) {

              }
          };


          new    BanYuan(){
              @Override
              public void method() {
                  System.out.println("半圆开发环境还是不错的..");
              }

              @Override
              public void method2() {

              }

              @Override
              public void method3() {

              }
          }.method();



    }

}
