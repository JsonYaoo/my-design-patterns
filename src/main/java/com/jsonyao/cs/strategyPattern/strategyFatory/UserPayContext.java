package com.jsonyao.cs.strategyPattern.strategyFatory;

import java.math.BigDecimal;

/**
 * 用户支付策略上下文
 */
public class UserPayContext {

    private UserPayService userPayService;

    public UserPayContext(String userType) {
        // 根据用户类型调用工厂创建不同的策略实现
        userPayService =  UserPayServiceStrategyFatory.getServiceByUserType(userType);
    }

    public BigDecimal getRealOrderPrice(BigDecimal orderPrice){
        return userPayService.quote(orderPrice);
    }
}
