package com.jsonyao.cs.singletonPattern;

/**
 * 6、枚举(JDK 1.5后)
 */
public class Singleton6 {

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

    public Singleton6() {

    }

    public Singleton6(int code) {
        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton6 getInstance(){// 调用getInstance()才使用枚举类, 才对枚举类进行加载
        return SingletonEum.INSTANCE.getInstance();
    }

}
