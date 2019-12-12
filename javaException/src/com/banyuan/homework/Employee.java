package com.banyuan.homework;

import com.banyuan.homework.money.CalMoney;

public class Employee implements CalMoney {

    private  String name;
    private  double balance=4000;//基本工资
    private  double hours;//小时

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getHours(){
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double calGetMoney() {
        double sum=0;
        if(this.hours<=196){
            sum=sum+this.getBalance();
        }else{
            sum=sum+this.getBalance()+(this.hours-196)*200;
        }
        return sum;
    }
}
