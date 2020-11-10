package com.jsonyao.cs.singletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 3、懒汉式-线程安全-锁方法实现
 */
public class Singleton3 implements Serializable {

    private static Singleton3 instance;// 类初始化为null

    private Singleton3() {
        // 防⽌反射获取多个对象的漏洞 false
        if(instance != null){
            throw new RuntimeException("获取单例异常!");
        }
    }

    private Singleton3(int code) {
        // 防⽌反射获取多个对象的漏洞 false
        if(instance != null){
            throw new RuntimeException("获取单例异常!");
        }

        System.out.println("设置了传递参数：" + code);
    }

    public static synchronized Singleton3 getInstance(int code){
        if(instance == null){
            instance = new Singleton3(code);
        }
        return instance;
    }

    // 防止反序列化获取多个对象的漏洞
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
