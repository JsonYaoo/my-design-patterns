package com.jsonyao.cs.SixPrinciples.DimitsLaw;

/**
 * 3、案例3-咖啡机类
 */
public class ConffeeMachine1 implements CoffeeMachine{

    @Override
    public void addCoffeeBean() {
        System.out.println("咖啡豆已添加...");
    }

    @Override
    public void addWater() {
        System.out.println("水已添加...");
    }

    @Override
    public void work() {
        System.out.println("开始制作咖啡...");
    }
}
