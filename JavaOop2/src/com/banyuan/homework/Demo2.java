package com.banyuan.homework;


import java.util.Scanner;

public class Demo2 {

//    3.现有n个班级每个班级m个学生,学生属性:学号,姓名,年龄,班级号,成绩
//    a.请根据每个班级的学生的年龄进行排序,并且输出相应的学生信息
//    b.求出每个班级的学生平均分进行升序排序


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级个数");
        int n = sc.nextInt();
        System.out.println("请输入每个班级学生人数");
        int m = sc.nextInt();

        double totalScore = 0.0;  //总成绩
        double avg = 0;

        double[] savg = new double[n];

        GradeScore[]  gradeScore=new GradeScore[n];


        Student[][] students = new Student[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Student stu = new Student();
                System.out.println("请输入第" + (i + 1) + "班级的第" + (j + 1) + "个学生学号:");
                int num = sc.nextInt();
                stu.setStuNumber(num);
                System.out.println("请输入第" + (i + 1) + "班级的第" + (j + 1) + "个学生姓名:");
                String name = sc.next();
                stu.setStuName(name);
                System.out.println("请输入第" + (i + 1) + "班级的第" + (j + 1) + "个学生年龄:");
                int age = sc.nextInt();
                stu.setAge(age);
                System.out.println("请输入第" + (i + 1) + "班级的第" + (j + 1) + "个学生班级:");
                int clazz = sc.nextInt();
                stu.setGradeClass(clazz);
                System.out.println("请输入第" + (i + 1) + "班级的第" + (j + 1) + "个学生成绩:");
                double score = sc.nextDouble();
                stu.setScore(score);

                totalScore += score;  //得到每个班级的总成绩
                students[i][j] = stu;

            }
            GradeScore  gradeScore1= new GradeScore();
            gradeScore1.setGradeClass(students[i][0].getGradeClass());

            //求每个班级的平均分
            avg = totalScore / m;
            savg[i] = avg;   //di  i  个班级的平均分   如果引用 GradeScore类 此行注释

            gradeScore1.setAvg(avg);
            totalScore=0;   //每个班级的总分必须得重新统计   所以计算分数得重新归零

            gradeScore[i]=gradeScore1;

        }

        //根据年龄进行排序
        for (int i = 0; i < n; i++) {

            //对每个班级里面的所有的学生进行年龄比较 然后进行排序
            for (int k = 0; k < m; k++) {
                System.out.println("第" + (i + 1) + "个班级的排序之前是:" + students[i][k].toString());
            }


            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m - j - 1; k++) {
                    if (students[i][k].getAge() < students[i][k + 1].getAge()) {
                        Student s = students[i][k];
                        students[i][k] = students[i][k + 1];
                        students[i][k + 1] = s;
                    }

                }

                for (int k = 0; k < m; k++) {
                    System.out.println("第" + (i + 1) + "个班级的排序之后是:" + students[i][k].toString());
                }

            }


        }


        //每个班级的平均分进行排序

        System.out.println("---------------------");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                if(savg[j]<savg[j+1]){
                    double  score=savg[j];
                    savg[j]=savg[j+1];
                    savg[j+1]=score;

                }
            }
        }

        for (int i = 0; i < savg.length; i++) {
            System.out.print(savg[i]+" ");
        }

    }


}
