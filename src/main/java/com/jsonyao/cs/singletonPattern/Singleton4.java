package com.jsonyao.cs.singletonPattern;

/**
 * 4、懒汉式-线程安全-静态内部类
 */
public class Singleton4 {

    private static class Holder {
        private static final Singleton4 SINGLE_TON = new Singleton4();
    }

    public Singleton4() { }

    public Singleton4(int code) {
        System.out.println("设置了传递参数：" + code);
    }

    public static Singleton4 getInstance(){
        return Holder.SINGLE_TON;
    }

}
