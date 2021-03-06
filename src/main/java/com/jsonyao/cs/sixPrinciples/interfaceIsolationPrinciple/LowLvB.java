package com.jsonyao.cs.sixPrinciples.interfaceIsolationPrinciple;

/**
 * 1、案例1-B类, 底层模块
 */
public class LowLvB implements InterfaceI1{

    /**
     * 实现方法1
     */
    @Override
    public void method1() {
        System.out.println("这是类B的方法1...");
    }

    /**
     * 实现方法2
     */
    @Override
    public void method2() {
        System.out.println("这是类B的方法2...");
    }

    /**
     * 实现方法3
     */
    @Override
    public void method3() {
        System.out.println("这是类B的方法3...");
    }

    /**
     * 空实现实现方法4(被迫实现)
     */
    @Override
    public void method4() {

    }

    /**
     * 空实现实现方法5(被迫实现)
     */
    @Override
    public void method5() {

    }
}
