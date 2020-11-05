package com.jsonyao.cs.factoryPattern.abstractFactory;

/**
 * 抽象工厂-新增生产新产品的接口
 */
public interface AbstractFatory {

    public Product createProduct();

    public NewProduct createNewProduct();

}
