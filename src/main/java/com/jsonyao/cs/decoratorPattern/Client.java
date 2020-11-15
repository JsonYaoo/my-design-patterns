package com.jsonyao.cs.decoratorPattern;

import java.math.BigDecimal;

/**
 * 装饰者模式
 * A. 定义：
 *      a. 装饰模式指的是, 在不必改变原类文件和使用继承的情况下, 动态地扩展一个对象的功能
 *      b. 通过创建一个包装对象, 也就是用装饰来包裹真实的对象
 * B. 特点:
 *      a. 装饰对象和真实对象具有相同的接口, 这样客户端对象就能以和真实对象相同的方式和装饰对象交互了
 *      b. 装饰对象包含一个真实对象的引用
 *      c. 装饰对象接收所有来自客户端的请求, 它把这些请求转发给真实的对象
 *      d. 装饰对象可以在转发这些请求以前或者以后增加一些附加功能, 这样就确保了在运行时, 不用修改指定对象的结构就可以在外部增加附加的功能.
 *         在面向对象的设计中, 通常是通过继承来实现对指定类的功能扩展
 * C. 结构:
 *      a. 顶层抽象父类: 具有最一般的特性, 是真实对象以及装饰组件的共同抽象
 *      b. 真实对象: 代表的是具有业务意义的, 能被修饰的底层对象, 这里是指具体的饮料
 *      c. 组件抽象父类: 具有装饰组件的一般性, 是装饰组件的抽象
 *      d. 包装对象: 代表的是能够装饰真实对象的组件, 实现了组件抽象父类
 * D. 优点:
 *      a. 装饰者模式与继承关系的目的都是扩展对象功能, 但是装饰者模式可以提供比继承更多的灵活性
 *      b. 通过使用不同的具体装饰类以及这些装饰类的排列组合, 可以创造出很多不同行为的组合
 * E. 缺点:
 *      a. 这种比继承更加灵活机动的特性, 也同时意味着更多的复杂性
 *      b. 装饰者模式会导致设计中出现许多小类, 如果过度使用, 会使程序变得很复杂
 * F. 使用场景:
 *      a. 需要扩展一个类的功能, 或者给一个类添加附加职责
 *      b. 需要动态地给一个对象添加功能, 这些功能可以再动态的撤销
 *      c. 需要增加由一些基本功能的排列组合而产生了非常大量的功能, 从而使继承关系变得不现实
 *      d. 当不能采用生成子类的方法进行扩充时, 一种情况是, 可能有大量独立的扩展, 为支持每一种组合将产生大量的子类, 导致子类数目呈爆炸性增长.
 *         另一种情况可能是因为类定义被隐藏, 或者定义不能用于生成子类
 *          =>  比如, JDK中的IO类便使用了装饰者模式, 其中的InputStream是顶层抽象父类, FilterInputStream是组件抽象父类
 * G. Relation:
 *      a. https://baike.baidu.com/item/%E8%A3%85%E9%A5%B0%E6%A8%A1%E5%BC%8F/10158540?fromtitle=%E8%A3%85%E9%A5%B0%E8%80%85%E6%A8%A1%E5%BC%8F&fromid=23706078&fr=aladdin
 *      b. https://www.cnblogs.com/of-fanruice/p/11565679.html
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 开始下单
         */
        // 要一杯 浓缩咖啡
        Beverage espresso = new Espresso();
        System.out.println(getDescAndCost(espresso.getDescription(), espresso.cost()));

        System.out.println();

        // 要一杯 深焙咖啡, 摩卡, 摩卡, 奶泡, 摩卡
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(getDescAndCost(beverage1.getDescription(), beverage1.cost()));

        System.out.println();

        // 要一杯 低咖啡因咖啡, 豆浆, 奶泡, 摩卡, 摩卡, 奶泡, 豆浆
        Beverage beverage2 = new Decaf();
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(getDescAndCost(beverage2.getDescription(), beverage2.cost()));
    }

    public static String getDescAndCost(String desc, BigDecimal cost){
        return String.format("Description: %s, $%f", desc, cost);
    }
}
