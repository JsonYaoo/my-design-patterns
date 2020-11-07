package com.jsonyao.cs.SixPrinciples.DimitsLaw;

/**
 * 3、案例3-人类
 */
public class Person1 implements Person{

    private CoffeeMachine coffeeMachine;

    @Override
    public void addCoffeeMachine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void makeCoffee() {
        coffeeMachine.addCoffeeBean();
        coffeeMachine.addWater();
        coffeeMachine.work();
    }

}
