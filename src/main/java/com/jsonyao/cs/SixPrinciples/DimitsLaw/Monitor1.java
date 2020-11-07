package com.jsonyao.cs.SixPrinciples.DimitsLaw;

/**
 * 1、案例1-班长类
 */
public class Monitor1 implements Monitor{

    private Student[] students;

    public void countStudent(){
        System.out.println(String.format("报告, 班上有%d个学生...", students.length));
    }

    @Override
    public void addStudents(Student[] students) {
        this.students = students;
    }

}
