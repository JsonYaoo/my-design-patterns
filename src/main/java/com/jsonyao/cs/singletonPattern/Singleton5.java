package com.jsonyao.cs.singletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 5、双重检查锁
 */
public class Singleton5 implements Serializable {

    private volatile static Singleton5 instance;// 必须要保证可见性

    private Singleton5() {
        // 防⽌反射获取多个对象的漏洞 false
        if(instance != null){
            throw new RuntimeException("获取单例异常!");
        }
    }

    private Singleton5(int code) {
        // 防⽌反射获取多个对象的漏洞 false
        if(instance != null){
            throw new RuntimeException("获取单例异常!");
        }

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

    // 防止反序列化获取多个对象的漏洞
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
