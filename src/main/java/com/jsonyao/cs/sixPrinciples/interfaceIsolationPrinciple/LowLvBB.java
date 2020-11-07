package com.jsonyao.cs.sixPrinciples.interfaceIsolationPrinciple;

/**
 * 2、案例2-B类, 底层模块
 */
public class LowLvBB implements InterfaceI2, InterfaceI3{

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

}
