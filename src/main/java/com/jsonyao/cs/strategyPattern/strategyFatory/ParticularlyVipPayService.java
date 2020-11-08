package com.jsonyao.cs.strategyPattern.strategyFatory;

import java.math.BigDecimal;

/**
 * 专用VIP用户支付服务
 */
public class ParticularlyVipPayService implements UserPayService{

    @Override
    public BigDecimal quote(BigDecimal orderPrcie) {
        System.out.println("专用VIP用户支付70%...");
        return new BigDecimal(0.7).multiply(orderPrcie);// 打7折
    }
}
