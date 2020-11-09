package com.jsonyao.cs.singletonPattern;

/**
 * 5、双重检查锁
 */
public class Singleton5 {

    private volatile static Singleton5 instance;// 必须要保证可见性

    public Singleton5() { }

    public Singleton5(int code) {
        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton5 getInstance(int code){
        if(instance == null){
            synchronized (Singleton5.class){
                if(instance == null){
                    instance = new Singleton5(code);
                }
            }
        }

        return instance;
    }

}
