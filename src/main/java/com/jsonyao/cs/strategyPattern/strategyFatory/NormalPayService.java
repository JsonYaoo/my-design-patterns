package com.jsonyao.cs.strategyPattern.strategyFatory;

import java.math.BigDecimal;

/**
 * 普通用户支付服务
 */
public class NormalPayService implements UserPayService{

    @Override
    public BigDecimal quote(BigDecimal orderPrcie) {
        System.out.println("普通用户支付100%...");
        return orderPrcie;
    }
}
