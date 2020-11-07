package com.jsonyao.cs.sixPrinciples.interfaceIsolationPrinciple;

/**
 * 1、案例1-D类, 底层模块
 */
public class LowLvD implements InterfaceI1{

    /**
     * 实现方法1
     */
    @Override
    public void method1() {
        System.out.println("这是类D的方法1...");
    }

    /**
     * 实现方法2
     */
    @Override
    public void method2() {

    }

    /**
     * 实现方法3
     */
    @Override
    public void method3() {

    }

    /**
     * 空实现实现方法4(被迫实现)
     */
    @Override
    public void method4() {
        System.out.println("这是类D的方法4...");
    }

    /**
     * 空实现实现方法5(被迫实现)
     */
    @Override
    public void method5() {
        System.out.println("这是类D的方法5...");
    }
}
