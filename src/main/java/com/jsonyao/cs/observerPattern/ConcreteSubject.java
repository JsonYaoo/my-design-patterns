package com.jsonyao.cs.observerPattern;

/**
 * 具体主题通知类
 */
public class ConcreteSubject extends Subject{

    public ConcreteSubject(String subjectState) {
        super(subjectState);
    }

    public void setSubjectState(String subjectState) {
        if(!super.getSubjectState().equals(subjectState)){
            super.setSubjectState(subjectState);
            super.notifyObserver();
        }
    }

}
