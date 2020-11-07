package com.jsonyao.cs.SixPrinciples.DependenceInVersionPrinciple;

/**
 * 1、案例2-书本类, 可以提供故事
 */
public class Book2 implements IReader{

    @Override
    public String getContent() {
        return "在很久很久以前...";
    }
}
