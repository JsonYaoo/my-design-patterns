package com.jsonyao.cs.strategyPattern.highlvStrategyPattern;

/**
 * 折扣型
 */
public class CashRebate implements CashSuper{

    // 折扣率
    private double moneyReBate;

    public CashRebate(double moneyReBate) {
        this.moneyReBate = moneyReBate;
    }

    @Override
    public double acceptCash(Double money) {
        // 打折
        return money * (moneyReBate / 10);
    }
}
