package com.jsonyao.cs.SixPrinciples.InterfaceIsolationPrinciple;

/**
 * 2、案例2-D类, 底层模块
 */
public class LowLvDD implements InterfaceI2, InterfaceI4{

    /**
     * 实现方法1
     */
    @Override
    public void method1() {
        System.out.println("这是类D的方法1...");
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
