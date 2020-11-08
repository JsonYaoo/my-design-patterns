package com.jsonyao.cs.strategyPattern.strategyFatory;

import java.math.BigDecimal;

/**
 * 超级VIP用户支付服务
 */
public class SuperVipPayService implements UserPayService{

    @Override
    public BigDecimal quote(BigDecimal orderPrcie) {
        System.out.println("超级VIP用户支付80%...");
        return new BigDecimal(0.8).multiply(orderPrcie);// 打8折
    }
}
