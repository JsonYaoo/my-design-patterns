package com.jsonyao.cs.sixPrinciples.dependenceInVersionPrinciple;

/**
 * 2、案例2-报纸类, 可以提供国家大事
 */
public class Newspaper2 implements IReader{


    @Override
    public String getContent() {
        return "今年的春运开始了...";
    }
}
