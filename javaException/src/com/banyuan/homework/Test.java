package com.banyuan.homework;

import com.banyuan.homework.pojo.HourEmp;
import com.banyuan.homework.pojo.SalEmp;

public class Test {


    public static void main(String[] args) {
        HourEmp  hourEmp1=new HourEmp();
        hourEmp1.setHourMoney(10);
        hourEmp1.setHour(200);

        HourEmp  hourEmp2=new HourEmp();
        hourEmp2.setHourMoney(10);
        hourEmp2.setHour(230);


        SalEmp  salEmp1=new SalEmp();
        salEmp1.setSalSum(5000);


        SalEmp  salEmp2=new SalEmp();
        salEmp2.setSalSum(200000);

        Employee  employee=new Employee();
        employee.setHours(205);

        Manager.addEmp(hourEmp1);
        Manager.addEmp(hourEmp2);
        Manager.addEmp(salEmp1);
        Manager.addEmp(salEmp2);
        Manager.addEmp(employee);

        //计算该工资月发总工资
        System.out.println( Manager.getSum());




    }


}
