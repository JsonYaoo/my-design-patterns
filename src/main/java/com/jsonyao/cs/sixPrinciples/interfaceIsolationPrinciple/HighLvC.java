package com.jsonyao.cs.sixPrinciples.interfaceIsolationPrinciple;

/**
 * 1、案例1-C类, 高层模块
 */
public class HighLvC {

    /**
     * 依赖方法1
     * @param interfaceI1
     */
    public static void depend1(InterfaceI1 interfaceI1){
        interfaceI1.method1();
    }

    /**
     * 依赖方法4
     * @param interfaceI1
     */
    public static void depend4(InterfaceI1 interfaceI1){
        interfaceI1.method4();
    }

    /**
     * 依赖方法5
     * @param interfaceI1
     */
    public static void depend5(InterfaceI1 interfaceI1){
        interfaceI1.method5();
    }
}
