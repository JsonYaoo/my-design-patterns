package com.jsonyao.cs.factoryPattern.abstractFactory;

/**
 * 生产Product B的工厂-新增生产新产品的接口
 */
public class FactoryProductB implements AbstractFatory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }

    @Override
    public NewProduct createNewProduct() {
        return new NewProductB();
    }
}
