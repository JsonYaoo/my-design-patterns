package com.jsonyao.cs.strategyPattern.highlvStrategyPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 策略模式-高级Context上下文, 通过反射注入
 */
public class CashContextReflect {

    private CashSuper cashSuper;

    public CashContextReflect(String className, Class[] paramsType, Object[] params) {
        try {
            Constructor con = Class.forName(className).getConstructor(paramsType);
            cashSuper = (CashSuper) con.newInstance(params);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
