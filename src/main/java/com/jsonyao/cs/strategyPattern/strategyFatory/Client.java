package com.jsonyao.cs.strategyPattern.strategyFatory;

import java.math.BigDecimal;

/**
 * 策略工厂模式
 * A. 定义
 *      a. 定义了策略种类枚举类, 通过枚举类和策略工厂创建不同的策略实现, 其中工厂根据类型反射创建实现类
 *      b. 还可以再通过建立策略上下文持有用户支付接口的依赖, 封装调用工厂创建的过程, 统一通过上下文接口调用获取实际价格接口
 * B. 优点
 *      a. 相对于普通的策略模式, 策略工厂模式解决了多种用户类型需求时出现的多层if-else代码臃肿的问题
 * C. Relation:
 *      a. https://www.cnblogs.com/lisingshen/p/11782250.html
 */
public class Client {

    public static void main(String[] args) {
        BigDecimal orderPrice = new BigDecimal(100);
        String userType = UserPayServiceEum.PARTICULALYVIP.getValue();

//        System.out.println(UserPayServiceStrategyFatory.getServiceByUserType(userType).quote(orderPrice));

        UserPayContext context = new UserPayContext(userType);
        System.out.println(context.getRealOrderPrice(orderPrice));
    }

}
