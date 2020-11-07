package com.jsonyao.cs.SixPrinciples.DimitsLaw;

/**
 * 4、案例4-人类
 */
public class Person2 implements Person{

    private CoffeeMachine coffeeMachine;

    @Override
    public void addCoffeeMachine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void makeCoffee() {
        coffeeMachine.work();
    }

}
