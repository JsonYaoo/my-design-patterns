package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 浓缩咖啡类-一种具体的饮料
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("2.00");
    }
}
