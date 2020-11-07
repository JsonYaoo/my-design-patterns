package com.jsonyao.cs.SixPrinciples.LiSubstitutionPrinciple;

/**
 * 2、B类-完成新增功能
 */
public class B extends A{

    @Override
    public int mySubtract(int a, int b) {
        return a + b;
    }

    public int myAdd100(int a, int b){
        return this.mySubtract(a, b) + 100;
    }
}
