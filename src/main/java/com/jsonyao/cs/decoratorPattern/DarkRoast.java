package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 深焙咖啡类-一种具体的饮料
 */
public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "深焙咖啡";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("3.00");
    }
}
