package com.jsonyao.cs.observerPattern;

/**
 * 具体观察者类
 */
public class ConcreteObserver extends Observer{

    // 观察者状态
    private String observerState;

    private String name;

    private Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(String.format("The Observer's state of %s is updating to %s.", name, observerState));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
