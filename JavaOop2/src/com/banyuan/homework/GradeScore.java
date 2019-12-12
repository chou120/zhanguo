package com.banyuan.homework;

public class GradeScore {

    private int  gradeClass;
    private double  avg;


    public GradeScore() {
    }

    public GradeScore(int gradeClass, double avg) {
        this.gradeClass = gradeClass;
        this.avg = avg;
    }

    public int getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(int gradeClass) {
        this.gradeClass = gradeClass;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "GradeScore{" +
                "gradeClass=" + gradeClass +
                ", avg=" + avg +
                '}';
    }
}
