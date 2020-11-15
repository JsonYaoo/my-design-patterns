package com.jsonyao.cs.BuilderPattern;

/**
 * 指挥者类
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装产品
    public Product assembledProduct(){
        builder.buildNilProduct();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
