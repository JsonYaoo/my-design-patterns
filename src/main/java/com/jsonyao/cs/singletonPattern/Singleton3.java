package com.jsonyao.cs.singletonPattern;

/**
 * 3、懒汉式-线程安全-锁方法实现
 */
public class Singleton3 {

    private static Singleton3 instance;// 类初始化为null

    public Singleton3() { }

    public Singleton3(int code) {
        System.out.println("设置了传递参数：" + code);
    }

    public static synchronized Singleton3 getInstance(int code){
        if(instance == null){
            instance = new Singleton3(code);
        }
        return instance;
    }

}
