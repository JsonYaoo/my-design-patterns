package com.jsonyao.cs.factoryPattern.fatoryMethod;

/**
 * 工厂方法模式
 * On Java Version 1.8
 * A. 基本介绍:
 *      a. 工厂方法模式是一种常用的类创建型设计模式
 *      b. 此模式的核心思想是封装类中变化的部分, 提取其中个性化善变的部分为独立类, 通过依赖注入以达到解耦、复用和方便后期维护拓展的目的
 *      c. 它的四个核心结构分别为: 抽象工厂, 具体工厂, 抽象产品, 具体产品
 * B. 核心概念:
 *      a. 抽象工厂角色: 它是工厂方法模式的核心, 与客户类无关, 是具体工厂角色必须实现的接口或必须继承的父类
 *          => 继承或者接口相当于对具体层的抽象, 也就是对具体工厂的抽象
 *      b. 具体工厂角色: 它含有和具体业务逻辑有关的代码, 由客户类指明创建, 用于创建对应具体的产品对象
 *          => 具体工厂交由客户类来指明创建, 同时利用该工厂创建对应的产品
 *      c. (对比简单工厂模式, 抽象逻辑不变)抽象产品角色: Product,它一般是具体产品继承的父类或实现的接口
 *          => 继承或者接口相当于对具体层的抽象
 *      d. (对比简单工厂模式, 抽象逻辑不变)具体产品角色: ProductA\B, 工厂类所创建的对象就是此角色的实例, 在Java中具体类实现
 *          => 具体的实现类相当于抽象业务的落地
 *      e. 所以, 工厂方法模式是对简单工厂模式的工厂做了抽象
 * C. 优点:
 *      a.
 * B. Relation:
 *      a. https://baike.baidu.com/item/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F/2361103?fr=aladdin
 */
public class Customer {

    public static void main(String[] args) {
        FactoryProductA factoryProductA = new FactoryProductA();
        factoryProductA.createProduct();

        FactoryProductB factoryProductB = new FactoryProductB();
        factoryProductB.createProduct();
    }

}
