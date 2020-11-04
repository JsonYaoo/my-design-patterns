package com.jsonyao.cs.factoryPattern.simpleFatory;

import com.jsonyao.cs.factoryPattern.initial.ProductA;
import com.jsonyao.cs.factoryPattern.initial.ProductB;

/**
 * 简单工厂模式
 * On Java Version 1.8
 * A. 基本介绍:
 *      a. 简单工厂模式属于创建型模式, 又叫做静态工厂方法模式, 但不属于23种GOF模式之一
 *      b. 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例
 *      c. 简单工厂模式是工厂模式家族中最简单实用的模式, 可以理解为是不同工厂模式的一个特殊实现
 * B. 核心概念:
 *      a. 工厂类角色: SimpleFatory, 是简单工厂模式的核心, 含有一定的商业逻辑和判断逻辑, 用来创建产品
 *          => 简单工厂类, 即是根据类型创建具体产品, 是具体产品的逻辑封装
 *      b. 抽象产品角色: Product,它一般是具体产品继承的父类或实现的接口
 *          => 继承或者接口相当于对具体层的抽象
 *      c. 具体产品角色: ProductA\B, 工厂类所创建的对象就是此角色的实例, 在Java中具体类实现
 *          => 具体的实现类相当于抽象业务的落地
 *      d. 所以, 简单工厂模式是对具体产品做了抽象
 * C. 优点:
 *      a. 简单工厂模式通过这种做法实现了对责任的分割, 专门的工厂类用于创建产品, 客户类免除了除直接创建产品对象的责任, 而仅仅是消费产品
 *      b. 客户类无须知道所创建的具体产品类的类名, 只需要知道具体产品类的对应参数即可
 *      c. 通过引入配置文件, 可以在不修改任何客户类代码的情况下更换和增加新的具体产品类, 在一定程度上提高了系统的灵活性
 * D. 缺点:
 *      a. 由于工厂类集中了所有产品的创建逻辑, 一旦不能工作, 整个系统都要受到影响
 *      b. 使用简单工厂模式将会增加系统中类的个数, 在一定程度上增加了系统的复杂度和理解度
 *      c. 系统扩展困难, 一旦添加新产品就不得不修改工厂逻辑, 在产品类型较多时, 有可能造成工厂逻辑过于复杂, 不利于系统的扩展和维护
 *      d. 由于使用了静态工厂方法, 造成了工厂角色无法形成基于继承的等级结构
 * E. 使用场景:
 *      a. 工厂类负责创建的对象比较少
 *      b. 客户类只知道传入工厂的参数, 对于如何创建对象逻辑不关心
 *      c. 由于简单工厂很容易违反高内聚责任分配原则, 因此一般只在很简单的情况下应用
 * F. Relation:
 *      a. https://baike.baidu.com/item/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/8801727?fr=aladdin
 *      b. https://zhidao.baidu.com/question/131823823.html
 */
public class Customer {

    public static void main(String[] args) {
        SimpleFatory simpleFatory = new SimpleFatory();
        simpleFatory.createProduct("A");
        simpleFatory.createProduct("B");
    }

}
