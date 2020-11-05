package com.jsonyao.cs.factoryPattern.abstractFactory;

/**
 * 工厂方法模式
 * On Java Version 1.8
 * A. 基本介绍:
 *      a. 抽象工厂模式隶属于设计模式中的创建型模式, 用于产品族的构建
 *      b. 抽象工厂是所有形态的工厂模式中, 最为抽象和最具一般性的一种形态, 因为抽象工厂角色可以生成所有产品族的产品
 *      c. 抽象工厂是指当有多个抽象角色时使用的一种工厂模式, 可以向客户提供提供一个接口, 使客户在不必指定产品的具体情况下(工厂方法模式),
 *         创建多个产品族中的产品对象(抽象工厂角色对多个工厂进行聚合, 暴露各种产品生产的接口)
 *      d. 工厂方法模式针对的是多个产品系列结构(同一个抽象产品角色, 同一个产品族), 而抽象工厂模式针对的是多个产品族结构(多个抽象产品角色,
 *         多个产品族), 一个产品族内有多个产品系列(同一个抽象产品角色, 同一个产品)
 * F. Relation:
 *      a. https://baike.baidu.com/item/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/2361182?fr=aladdin
 *      b. https://www.cnblogs.com/yssjun/p/11102162.html
 */
public class Customer {

    public static void main(String[] args) {
        FactoryProductA factoryProductA = new FactoryProductA();
        factoryProductA.createProduct();
        factoryProductA.createNewProduct();

        FactoryProductB factoryProductB = new FactoryProductB();
        factoryProductB.createProduct();
        factoryProductB.createNewProduct();
    }

}
