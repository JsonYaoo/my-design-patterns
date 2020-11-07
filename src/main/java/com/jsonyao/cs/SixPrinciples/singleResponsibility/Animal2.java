package com.jsonyao.cs.SixPrinciples.singleResponsibility;

/**
 * 3、案例修改方案2-新增吃肉eat2方法
 */
public class Animal2 {

    public static void eat(String animalName){
        System.out.println(animalName + "吃草");
    }

    public static void eat2(String animalName){
        System.out.println(animalName + "吃肉");
    }

}
