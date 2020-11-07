package com.jsonyao.cs.SixPrinciples.InterfaceIsolationPrinciple;

/**
 * 2、案例2-AA类, 高层模块
 */
public class HighLvAA {

    /**
     * 依赖方法1
     * @param interfaceI2
     */
    public static void depend1(InterfaceI2 interfaceI2){
        interfaceI2.method1();
    }

    /**
     * 依赖方法2
     * @param interfaceI3
     */
    public static void depend2(InterfaceI3 interfaceI3){
        interfaceI3.method2();
    }

    /**
     * 依赖方法3
     * @param interfaceI3
     */
    public static void depend3(InterfaceI3 interfaceI3){
        interfaceI3.method3();
    }
}
