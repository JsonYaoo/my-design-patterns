package com.jsonyao.cs.observerPattern;

import java.util.Vector;

/**
 * 客户主题抽象类
 */
public abstract class CustomerSubject {

    private Vector<JobStation> observers = new Vector<>();

    private String state;

    public void addObserver(JobStation jobStation){
        observers.add(jobStation);
    }

    public void removeObserver(JobStation jobStation){
        observers.remove(jobStation);
    }

    public abstract void payOrder();

    public Vector<JobStation> getObservers() {
        return observers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
