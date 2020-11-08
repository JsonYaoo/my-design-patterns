package com.jsonyao.cs.singletonPattern;

/**
 * 2、懒汉式-线程不安全
 */
public class Singleton2 {

    private static Singleton2 instance;// 类初始化为null

    public Singleton2() { }

    public Singleton2(int code) {
        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton2 getInstance(int code){
        if(instance == null){
            instance = new Singleton2(code);
        }
        return instance;
    }

}
