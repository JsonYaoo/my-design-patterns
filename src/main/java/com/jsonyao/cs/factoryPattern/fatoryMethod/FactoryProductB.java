package com.jsonyao.cs.factoryPattern.fatoryMethod;

/**
 * 生产Product B的工厂
 */
public class FactoryProductB implements AbstractFatory{

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
