package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 调料装饰者抽象类-因为调料叠加以后也是一种饮料, 所以能继承饮料抽象类
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有的具体调料装饰者都必须实现getDescription(), 这样才能够用递归的方式来得到所选饮料的整体描述
     * @return
     */
    public abstract String getDescription();

}
