package com.jsonyao.cs.factoryPattern.fatoryMethod;

/**
 * 生产Product A的工厂
 */
public class FactoryProductA implements AbstractFatory{

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
