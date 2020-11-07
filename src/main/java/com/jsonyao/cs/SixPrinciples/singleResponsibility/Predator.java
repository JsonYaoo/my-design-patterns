package com.jsonyao.cs.SixPrinciples.singleResponsibility;

/**
 * 4、案例修改方案3-肉食动物
 */
public class Predator extends Animal{

    public static void eat(String animalName){
        System.out.println(animalName + "吃肉");
    }
}
