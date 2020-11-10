package com.jsonyao.cs.singletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 2、懒汉式-线程不安全
 */
public class Singleton2 implements Serializable {

    private static Singleton2 instance;// 类初始化为null

    private Singleton2() {
        // 防⽌反射获取多个对象的漏洞 false
        if(instance != null){
            throw new RuntimeException("获取单例异常!");
        }
    }

    private Singleton2(int code) {
        // 防⽌反射获取多个对象的漏洞 false
        if(instance != null){
            throw new RuntimeException("获取单例异常!");
        }

        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton2 getInstance(int code){
        if(instance == null){
            instance = new Singleton2(code);
        }
        return instance;
    }

    // 防止反序列化获取多个对象的漏洞
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
