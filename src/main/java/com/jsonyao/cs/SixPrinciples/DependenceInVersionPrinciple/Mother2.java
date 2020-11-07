package com.jsonyao.cs.SixPrinciples.DependenceInVersionPrinciple;

/**
 * 2、案例2-母亲类, 可以照着读物读
 */
public class Mother2 {

    public static void narrate(IReader iReader){
        System.out.println("妈妈开始读读物: ");
        System.out.println(iReader.getContent());
    }

}
