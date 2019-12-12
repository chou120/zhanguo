class Fu{
    public void show(){
        System.out.println("父类的show");
    }   
}
class Son extends Fu{
    public void show(){
            System.out.println("子类的show");
    }    
    public void method(){
            System.out.println("子类的method");
    }   
}
class  Test{
    public  static  void  main(String [] args){
           Fu  fu=new Son();
           fu.method();   
     }
     
}


##----------------------------
class A{
    public void show(){
                show2();
    } 
    public void show2(){
                System.out.println("我");
    }   
}
class B extends  A{        
    public void show2(){
                System.out.println("是");
    } 
}
class  C  extends B{ 
        public void show(){
                    super.show();
        } 
        public void show2(){
                    System.out.println("你爸爸");
        }    
}
class  Test{  
    public  static void  main(String[]  args){
        A  a=new B();
        a.show();     
        B  b=new  C();
        b.show();
    
    }

}

### 什么叫抽象类：指的就是类的抽象体  类的一个具体事物是对象  但是有时候
### 有一些类的信息不足够描绘出一个具体的对象  那么这个类就是抽象类 
###  抽象类的关键字  abstract


##  抽象类特点:1.抽象类里面有变量也可以有常量 
             2.抽象类里面可以有普通方法可以有抽象方法
             3.抽象类的子类可以是抽象类也可以是普通类
             4.抽象类不能直接创建对象(具体的实现通过子类实现)
             5.abstract 不能和 private  static  final 混用
             

### 加入：我们在开发一个系统  需要对员工类进行设计   员工包含3个属性：姓名 工号,工资
### 经理也是员工 除了含员工属性之外 还有另一个奖金属性
### 使用继承思想设计员工类和经理类，要求类中提供必要的方法进行属性访问    



###    现在有老师教课的功能    上课的课程分为两个阶段 每个阶段不同的老师在带
###    javaSE班级    javaEE班级
###    现在两个老师都有相同的共性:姓名,年龄,讲课
####    要求:例如 在测试类最终输出：1.老周在上javaSE部分的课程
####                           2.老李在上javaEE部分的课程


##  自己总结  抽象类和接口的区别   
















