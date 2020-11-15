package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 摩卡调料类-一种具体的调料
 */
public class Mocha extends CondimentDecorator {

    /**
     * 持有一个具体饮料的引用
     */
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 摩卡";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.2").add(beverage.cost());
    }
}
