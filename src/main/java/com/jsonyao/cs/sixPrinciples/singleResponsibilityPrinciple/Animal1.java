package com.jsonyao.cs.sixPrinciples.singleResponsibilityPrinciple;

/**
 * 2、案例修改方案1-直接在Animal类上修改
 */
public class Animal1 {

    public static void eat(String animalName){
        if("老虎".equals(animalName) || "狼".equals(animalName)){
            System.out.println(animalName + "吃肉");
        }else {
            System.out.println(animalName + "吃草");
        }
    }

}
