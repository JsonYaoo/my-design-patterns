package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 低咖啡因咖啡类-一种具体的饮料
 */
public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "低咖啡因咖啡";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("4.00");
    }
}
