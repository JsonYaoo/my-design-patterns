package com.jsonyao.cs.observerPattern;

import java.util.Vector;

/**
 * 抽象主题类
 */
public abstract class Subject {

    // 保证线程安全
    private Vector<Observer> observers = new Vector<>();

    // 主题内部状态
    private String subjectState;

    /**
     * 添加观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * 主题发出通知
     */
    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Subject(String subjectState) {
        this.subjectState = subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    public String getSubjectState() {
        return subjectState;
    }

}
