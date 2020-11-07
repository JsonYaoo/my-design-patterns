package com.jsonyao.cs.sixPrinciples.interfaceIsolationPrinciple;

/**
 * 2、案例2-C类, 高层模块
 */
public class HighLvCC {

    /**
     * 依赖方法1
     * @param interfaceI2
     */
    public static void depend1(InterfaceI2 interfaceI2){
        interfaceI2.method1();
    }

    /**
     * 依赖方法4
     * @param interfaceI4
     */
    public static void depend4(InterfaceI4 interfaceI4){
        interfaceI4.method4();
    }

    /**
     * 依赖方法5
     * @param interfaceI4
     */
    public static void depend5(InterfaceI4 interfaceI4){
        interfaceI4.method5();
    }
}
