package com.jsonyao.cs.sixPrinciples.interfaceIsolationPrinciple;

/**
 * 1、案例1-A类, 高层模块
 */
public class HighLvA {

    /**
     * 依赖方法1
     * @param interfaceI1
     */
    public static void depend1(InterfaceI1 interfaceI1){
        interfaceI1.method1();
    }

    /**
     * 依赖方法2
     * @param interfaceI1
     */
    public static void depend2(InterfaceI1 interfaceI1){
        interfaceI1.method2();
    }

    /**
     * 依赖方法3
     * @param interfaceI1
     */
    public static void depend3(InterfaceI1 interfaceI1){
        interfaceI1.method3();
    }
}
