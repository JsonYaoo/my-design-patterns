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
 * B. 核心思想:
 *      a. 在前两种模式中, 不管工厂怎么拆分和抽象, 都只是针对一类产品Product
 *      b. 如果要生产另一种产品NewProduct, 则需要通过在AbstractFactory中增加创建NewProduct的接口, 并在具体子工厂中实现对应NewProduct的创建,
 *         前提是子工厂有实现生产该产品, 否则空实现的接口会什么也不干
 * C. 优点:
 *      a. 分离了具体的类, 客户通过抽象接口操纵实例, 产品的类名也在具体工厂的实现中被分离, 它们不出现在客户代码中(也是工厂方法模式的优点)
 *      b. 易于交换产品系列, 只需要改变具体工厂或者调用不同的接口, 即可生产不同的产品
 *      c. 有利于产品的一致性, 当一个系列的产品对象被设计成一起工作时, 抽象工厂很容易实现一个应用一次只能使用同一个系列的对象
 * D. 缺点:
 *      a. 难以支持新种类的产品, 产品族扩展费力, 因为抽象工厂接口确定了可以被创建的产品集合, 假如产品族需要增加一个新的产品, 则几乎所有的工厂类
 *         都需要进行修改, 因此使用抽象工厂模式时, 对产品等级结构的划分非常重要
 * E. 使用场景:
 *      a. 一个系统要独立于它的产品创建、组合和表示时(无关性)
 *      b. 一个系统要由多个产品系列中的一个来配置时
 *      c. 需要强调一系列相关的产品对象的设计以便进行联合使用时
 *      d. 提供一个产品类库, 而只想显示它们的接口而不是实现时
 *      => 也就是需要创建的产品是一系列相互关联或者相互依赖的产品组时, 可以使用抽象工厂模式, 假如产品间不存在关联或约束时, 则使用多个独立的工厂来对
 *         产品进行创建, 则更适合一点
 * F. Relation:
 *      a. https://baike.baidu.com/item/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/2361182?fr=aladdin
 *      b. https://www.cnblogs.com/yssjun/p/11102162.html
 *      c. https://www.cnblogs.com/sallyiszxm/p/10987135.html
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
