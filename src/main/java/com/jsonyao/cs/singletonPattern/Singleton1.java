package com.jsonyao.cs.singletonPattern;

/**
 * 1、饿汉式
 */
public class Singleton1 {

    private static final Singleton1 instance = new Singleton1();

    public Singleton1() { }

    public Singleton1(int code) {
        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton1 getInstance(){
        return instance;
    }

}
