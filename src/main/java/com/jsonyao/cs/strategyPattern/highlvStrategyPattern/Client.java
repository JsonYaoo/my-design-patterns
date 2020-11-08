package com.jsonyao.cs.strategyPattern.highlvStrategyPattern;

/**
 * 策略模式-高级用法
 * A. 通过反射创建实现类
 * B. 优点:
 *      a. 代码看起来高端整洁一点, 然而并没有什么用
 * C. 缺点:
 *      a. 实现功能与简单策略模式相同, 但代码复杂度要高点, 建议使用简单策略模式
 */
public class Client {

    public static void main(String[] args) {
        double paiedMoney = 100d;

//        // 普通型
//        String type = "com.jsonyao.cs.strategyPattern.highlvStrategyPattern.CashNormal";
//        Class[] paramsType = {};
//        Object[] params = {};
//
//        // 根据参数构建上下文
//        CashContextReflect context = new CashContextReflect(type, paramsType, params);
//        System.out.println(context.getResult(paiedMoney));

//        // 折扣型
//        String type = "com.jsonyao.cs.strategyPattern.highlvStrategyPattern.CashRebate";
//        Class[] paramsType = {double.class};
//        Object[] params = {8.0};// 打8折
//
//        // 根据参数构建上下文
//        CashContextReflect context = new CashContextReflect(type, paramsType, params);
//        System.out.println(context.getResult(paiedMoney));

        // 返现型
        String type = "com.jsonyao.cs.strategyPattern.highlvStrategyPattern.CashReturn";
        Class[] paramsType = {double.class, double.class};
        Object[] params = {70d, 10d};// 满70减10

        // 根据参数构建上下文
        CashContextReflect context = new CashContextReflect(type, paramsType, params);
        System.out.println(context.getResult(paiedMoney));
    }
}
