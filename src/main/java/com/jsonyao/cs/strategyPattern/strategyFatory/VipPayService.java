package com.jsonyao.cs.strategyPattern.strategyFatory;

import java.math.BigDecimal;

/**
 * VIP用户支付服务
 */
public class VipPayService implements UserPayService{

    @Override
    public BigDecimal quote(BigDecimal orderPrcie) {
        System.out.println("VIP用户支付90%...");
        return new BigDecimal(0.9).multiply(orderPrcie);// 打9折
    }
}
