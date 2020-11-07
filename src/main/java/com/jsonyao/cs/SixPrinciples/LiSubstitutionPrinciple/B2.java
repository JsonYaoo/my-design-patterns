package com.jsonyao.cs.SixPrinciples.LiSubstitutionPrinciple;

/**
 * 3、B2类-通过组合依赖完成新增功能
 */
public class B2{

    static A aa = new A();

    public int mySubtract(int a, int b){
        return aa.mySubtract(a, b);
    }

    public int myAdd(int a, int b) {
        return aa.mySubtract(a, -b);
    }

    public int myAdd100(int a, int b){
        return this.myAdd(a, b) + 100;
    }
}
