package com.jsonyao.cs.SixPrinciples.DimitsLaw;

/**
 * 1、案例1-老师类
 */
public class Teacher1 implements Teacher{

    @Override
    public void commadMonitor(Monitor monitor){
        Student[] students = new Student[3];
        students[0] = new Student(1, "张三");
        students[1] = new Student(2, "李四");
        students[2] = new Student(3, "王五");

        monitor.addStudents(students);
        monitor.countStudent();
    }

}
