package com.jsonyao.cs.singletonPattern;

/**
 * 1、饿汉式
 */
public class Singleton1 {

    private static final Singleton1 instance = new Singleton1();

    public Singleton1() { }

    public static Singleton1 getInstance(){
        return instance;
    }

}
