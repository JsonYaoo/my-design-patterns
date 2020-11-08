package com.jsonyao.cs.strategyPattern.highlvStrategyPattern;

/**
 * 反现型
 */
public class CashReturn implements CashSuper{

    /**
     * 应收金额
     */
    private double moneyCondition;

    /**
     * 返利金额
     */
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(Double money) {
        // 大于应收金额则进行返利
        if(money >= moneyCondition){
            money = money - moneyReturn;
        }

        return money;
    }
}
