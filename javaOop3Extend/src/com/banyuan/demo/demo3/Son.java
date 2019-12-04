package com.banyuan.demo.demo3;

public class Son  extends  Fu {

    /**
     * private  成员只能在本类被访问
     * public   成员能被任何类访问
     */

    private   String  name="子类名字";
    private   String  city="子类城市";

    public Son(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Son() {
    }

//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String getCity() {
//        return city;
//    }
//
//    @Override
//    public void setCity(String city) {
//        this.city = city;
//    }

    public  void  get(){

        System.out.println(this.getName()+"----"+super.getName());

    }






}
