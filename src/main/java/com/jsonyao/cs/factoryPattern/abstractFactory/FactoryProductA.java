package com.jsonyao.cs.factoryPattern.abstractFactory;

/**
 * 生产Product A的工厂-新增生产新产品的接口
 */
public class FactoryProductA implements AbstractFatory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }

    @Override
    public NewProduct createNewProduct() {
        return new NewProductA();
    }
}
