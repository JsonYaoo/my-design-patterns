package com.jsonyao.cs.sixPrinciples.dimitsLaw;

/**
 * 2、案例2-老师类
 */
public class Teacher2 implements Teacher{

    @Override
    public void commadMonitor(Monitor monitor) {
        monitor.countStudent();
    }
}
