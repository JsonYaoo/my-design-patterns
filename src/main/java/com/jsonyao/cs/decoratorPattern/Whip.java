package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 奶泡调料类-一种具体的调料
 */
public class Whip extends CondimentDecorator {

    /**
     * 持有一个具体饮料的引用
     */
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 奶泡";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.4").add(beverage.cost());
    }
}
