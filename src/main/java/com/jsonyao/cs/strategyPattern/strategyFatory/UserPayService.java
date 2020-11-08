package com.jsonyao.cs.strategyPattern.strategyFatory;

import java.math.BigDecimal;

/**
 * 用户支付接口
 */
public interface UserPayService {

    public BigDecimal quote(BigDecimal orderPrcie);

}
