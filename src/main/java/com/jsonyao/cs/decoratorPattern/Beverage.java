package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 顶层抽象父类-饮料抽象类
 */
public abstract class Beverage {

    private String description = "Unkown Beverage";

    /**
     * 获取饮料描述-子类中重写
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 获取饮料价格-子类中实现
     * @return
     */
    public abstract BigDecimal cost();
}
