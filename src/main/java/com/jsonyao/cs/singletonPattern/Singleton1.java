package com.jsonyao.cs.singletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 1、饿汉式
 */
public class Singleton1 implements Serializable {

    private static final Singleton1 instance = new Singleton1();

    private Singleton1() {
        // 防⽌反射获取多个对象的漏洞 true
        if(instance != null){
            throw new RuntimeException("获取单例异常!");
        }
    }

    private Singleton1(int code) {
        // 防⽌反射获取多个对象的漏洞 true
        if(instance != null){
            throw new RuntimeException("获取单例异常!");
        }

        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton1 getInstance(){
        return instance;
    }

    // 防止反序列化获取多个对象的漏洞
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
