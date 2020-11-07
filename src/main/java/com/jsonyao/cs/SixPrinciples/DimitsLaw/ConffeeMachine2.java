package com.jsonyao.cs.SixPrinciples.DimitsLaw;

/**
 * 4、案例4-咖啡机类
 */
public class ConffeeMachine2 implements CoffeeMachine{

    @Override
    public void addCoffeeBean() {
        System.out.println("咖啡豆不支持手工添加!");
    }

    @Override
    public void addWater() {
        System.out.println("水不支持手工添加!");
    }

    public void slefAddCoffeeBean() {
        System.out.println("咖啡豆已添加...");
    }

    public void selfAddWater() {
        System.out.println("水已添加...");
    }

    @Override
    public void work() {
        this.slefAddCoffeeBean();
        this.selfAddWater();
        System.out.println("开始制作咖啡...");
    }

}
