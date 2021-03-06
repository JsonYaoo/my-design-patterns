package com.jsonyao.cs.factoryPattern.fatoryMethod;

/**
 * 工厂方法模式
 * On Java Version 1.8
 * HighLvA. 基本介绍:
 *      a. 工厂方法模式是一种常用的类创建型设计模式
 *      b. 此模式的核心思想是封装类中变化的部分, 提取其中个性化善变的部分为独立类, 通过依赖注入以达到解耦、复用和方便后期维护拓展的目的
 *      c. 它的四个核心结构分别为: 抽象工厂, 具体工厂, 抽象产品, 具体产品
 * B. 核心概念:
 *      a. 抽象工厂角色: 它是工厂方法模式的核心, 与客户类无关, 是具体工厂角色必须实现的接口或必须继承的父类
 *          => 继承或者接口相当于对具体层的抽象, 也就是对具体工厂的抽象
 *      b. 具体工厂角色: 它含有和具体业务逻辑有关的代码, 由客户类指明创建, 用于创建对应具体的产品对象
 *          => 具体工厂交由客户类来指明创建, 同时利用该工厂创建对应的产品
 *      c. (对比简单工厂模式, 抽象逻辑不变)抽象产品角色: Product, 它一般是具体产品继承的父类或实现的接口
 *          => 继承或者接口相当于对具体层的抽象
 *      d. (对比简单工厂模式, 抽象逻辑不变)具体产品角色: ProductA\B, 工厂类所创建的对象就是此角色的实例, 在Java中具体类实现
 *          => 具体的实现类相当于抽象业务的落地
 *      e. 所以, 工厂方法模式是对简单工厂模式的工厂做了抽象
 * C. 优点:
 *      a. 工厂方法模式去掉了简单工厂模式中工厂的静态属性, 使得它可以被子类继承, 这样在简单工厂模式里集中在工厂方法上的压力就可以由工厂方法模式里不同的工厂子类分担
 *      b. (开闭原则) 当有新的产品产生时, 只要按照抽象产品角色、抽象工厂角色提供的合同来生成, 那么就可以被客户使用, 而不必去修改任何已有的代码
 * D. 缺点:
 *      a. 在添加新产品时需要编写新的具体产品类, 而且还要提供与之对应的具体工厂类, 可见系统中类的个数将成对增加, 在一定程度上增加了系统的复杂度,
 *         而更多的类需要编译和运行, 会给系统带来一些额外的开销
 * E.使用场景:
 *      a. 对于某种产品, 调用者清楚地知道应该使用哪个具体工厂服务, 从而实例化该具体工厂, 生产出具体的产品来
 *         => 比如Java Collection中的iterator()方法
 *      b. 只是需要一种产品, 而不想知道也不需要知道究竟是哪个工厂生产的, 即最终选用哪个具体工厂的决定权在生产者一方, 生产者根据当前系统的情况
 *         来实例化一个具体的工厂返回给使用者, 而这个决策过程对于使用者来说是透明的
 * F. Relation:
 *      a. https://baike.baidu.com/item/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F/2361103?fr=aladdin
 *      b. https://blog.csdn.net/qq_42428264/article/details/90721656
 */
public class Customer {

    public static void main(String[] args) {
        FactoryProductA factoryProductA = new FactoryProductA();
        factoryProductA.createProduct();

        FactoryProductB factoryProductB = new FactoryProductB();
        factoryProductB.createProduct();
    }

}
