package com.jsonyao.cs.BuilderPattern;

/**
 * 抽象Builder类
 */
public abstract class Builder {

    // 构造空属性产品
    protected Product product;

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    // 获取产品
    public void buildNilProduct() {
        this.product = new Product();
    }

    // 获取产品
    public Product getProduct() {
        return product;
    }
}
