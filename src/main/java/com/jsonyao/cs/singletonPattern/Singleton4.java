package com.jsonyao.cs.singletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 4、懒汉式-线程安全-静态内部类
 */
public class Singleton4 implements Serializable {

    private static class Holder {
        private static final Singleton4 SINGLE_TON = new Singleton4();
    }

    private Singleton4() {
        // 防⽌反射获取多个对象的漏洞 true
        if(Holder.SINGLE_TON != null){
            throw new RuntimeException("获取单例异常!");
        }
    }

    private Singleton4(int code) {
        // 防⽌反射获取多个对象的漏洞 true
        if(Holder.SINGLE_TON != null){
            throw new RuntimeException("获取单例异常!");
        }

        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton4 getInstance(){
        return Holder.SINGLE_TON;
    }

    // 防止反序列化获取多个对象的漏洞
    private Object readResolve() throws ObjectStreamException {
        return Holder.SINGLE_TON;
    }

}
