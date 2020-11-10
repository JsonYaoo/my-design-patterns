package com.jsonyao.cs.singletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 6、枚举(JDK 1.5后)
 */
public class Singleton6 implements Serializable {

    private static enum SingletonEum {
        INSTANCE;// 创建一个枚举类, 天生就是单例的

        private Singleton6 singleton6;

        SingletonEum() {// 创建时创建singleton6单例对象
            singleton6 = new Singleton6();
        }

        public Singleton6 getInstance(){
            return singleton6;
        }
    }

    private Singleton6() {
        // 防⽌反射获取多个对象的漏洞 true
        if(SingletonEum.INSTANCE != null){// 通过反射创建会加载枚举类, 然后被校验住
            throw new RuntimeException("获取单例异常!");
        }
    }

    private Singleton6(int code) {
        // 防⽌反射获取多个对象的漏洞 true
        if(SingletonEum.INSTANCE != null){// 通过反射创建会加载枚举类, 然后被校验住
            throw new RuntimeException("获取单例异常!");
        }

        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton6 getInstance(){// 调用getInstance()才使用枚举类, 才对枚举类进行加载, 再枚举类的构造方法中创建了单例
        return SingletonEum.INSTANCE.getInstance();
    }

    // 防止反序列化获取多个对象的漏洞
    private Object readResolve() throws ObjectStreamException {
        return SingletonEum.INSTANCE.getInstance();
    }
}
