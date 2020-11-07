package com.jsonyao.cs.SixPrinciples.DependenceInVersionPrinciple;

/**
 * 1、案例1-母亲类, 可以照着书读
 */
public class Mother {

    public static void narrate(Book book){
        System.out.println("妈妈开始读书: ");
        System.out.println(book.getContent());
    }

}
