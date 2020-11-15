package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 豆浆调料类-一种具体的调料
 */
public class Soy extends CondimentDecorator {

    /**
     * 持有一个具体饮料的引用
     */
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 豆浆";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.3").add(beverage.cost());
    }
}
