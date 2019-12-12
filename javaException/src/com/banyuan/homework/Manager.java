package com.banyuan.homework;

public class Manager {

    static  Employee[]  emp=new Employee[10];
    static  int count=0;




    //添加一个员工
    public   static  void   addEmp(Employee employee){
        emp[count]=employee;
        count++;
    }


    //删除员工
    public   static  void  delEmp(String  name){
        int  index=-1;
        for (int i = 0; i <count; i++) {
            if(emp[i].getName().equals(name)){
                index=i;
                for(int  j=index;index<count;j++){
                    emp[j]=emp[j+1];
                    if(j==count-1){
                        emp[j]=null;
                        count--;
                        break;
                    }
                }
                break; //退出外面循环
            }
        }
    }


    //显示员工工资
    public  static   double getMoney(String  name){
        for (int i = 0; i <count ; i++) {
            if(emp[i].getName().equals(name)){
                //返回基本工资
                return emp[i].getBalance();
            }
        }
        return 0;
    }

    //输出员工工资的总和
    public  static  double getSum(){
        double  sum=0;
        for (int i = 0; i <count ; i++) {
            Employee  e=emp[i];  //理想
            sum+=e.calGetMoney();
        }
        return  sum;
    }




}
