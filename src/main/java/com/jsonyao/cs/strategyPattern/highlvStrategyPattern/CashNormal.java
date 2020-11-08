package com.jsonyao.cs.strategyPattern.highlvStrategyPattern;

/**
 * 普通型
 */
public class CashNormal implements CashSuper{


    @Override
    public double acceptCash(Double money) {
        // 实收金额
        return money;
    }
}
