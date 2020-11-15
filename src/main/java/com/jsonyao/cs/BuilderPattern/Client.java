package com.jsonyao.cs.BuilderPattern;

/**
 * 建造者模式
 * A. 定义:
 *      a. 指将一个复杂对象的构造与他的表示分离, 使同样的构建过程可以创建不同的表示
 *      b. 是将一个复杂的对象分解为多个简单的对象, 然后一步步构建而成, 它将变与不变相分离, 即产品的组成部分是不变的, 但每一部分是可以灵活选择的
 * B. 角色:
 *      a. 指挥者(Director): 它调用建造者对象中的部件构造与装配方法完成复杂对象的创建, 在指挥者中不涉及具体的产品信息
 *      b. 抽象构造者(Builder): 它是一个包含创建产品各个子部分的抽象方法的接口, 通常还包含一个返回复杂产品的getResult()方法
 *      c. 具体构造者(Concrete Builder): 实现Builder接口, 完成复杂产品的各个部件的具体方法
 *      d. 产品(Product): 它是包含多个部件的复杂对象, 由具体建造者来创建其各个零部件
 *      => 模式的扩展: 如果创建的产品种类只有一种, 只需要一个具体建造者时, 可以省略掉抽象建造者, 甚至可以省略掉指挥角色
 * C. 过程:
 *      a. 指挥者Director直接和客户Client进行需求沟通
 *      b. 沟通后指挥者将客户创建产品的需求划分为各个部件的建造请求Builder
 *      c. 将各个部件的建造请求委派到具体的建造者ConcreteBuilder
 *      d. 各个具体建造者ConcreteBuilder负责进行产品部件的构建
 *      e. 最终构建成具体产品Product
 *      => 当需要创建的产品具备复杂创建过程时, 可以抽取公共创建过程, 然后交由具体实现类自定义创建流程, 使得同样得创建行为可以生产出不同的产品,
 *         分离了创建与表示, 使创建的产品灵活性大大增加
 * D. 优点:
 *      a. 封装性好, 构建和表示分离, 即同样的构建过程能取到不同的表示
 *      b. 扩展性好, 各个具体的构造者独立, 有利于系统的解耦
 *      c. 客户端不必知道产品内部组成的细节, 建造者可以对创建过程逐步细化, 而不对其他模块产生任何影响, 便于控制细节风险
 *      d. 改造多参数构造对象可以使得传递参数更加灵活, 代码具有更高的可读性
 * E. 缺点；
 *      a. 产品的组成部分必须相同, 这限制了其使用范围
 *      b. 如果产品的内部变化复杂, 当产品内部发生变化时, 则建造者也要同步修改, 后期维护成本较大
 * F. 使用场景:
 *      a. 相同的方法, 当有不同的执行顺序时, 产生不同的结果
 *      b. 多个部件零件, 都可以装配到一个对象中, 但是产生的结果又不相同
 *      c. 产品类非常复杂, 或者产品类中不同的调用顺序产生不同的作用
 *      d. 初始化一个对象特别复杂, 参数多, 而且很多参数都具有默认值
 * G. 建造者模式 & 工厂模式:
 *      a. 建造者模式注重零部件的组装过程, 而工厂模式更注重零部件的创建过程, 但两者可以结合使用
 *      b. 建造者模式注重方法的调用顺序, 而工厂模式注重创建对象
 *      c. 创建对象的方式不同, 建造者模式通过指挥类来指导如何生成对象, 包括对象的组装过程和构造步骤, 而工厂模式是通过客户端实例化工厂类, 然后调用工厂方法获取所需的产品对象
 *      d. 关注重点不一样, 建造者模式不仅要创建出对象, 还要知道对象由哪些部件组成, 而工厂模式只需要把对象创建出来就可以了
 *      e. 创建对象的粒度不同, 建造者模式创建复杂对象, 由各种复杂的部件组成, 建造顺序不同, 最终对象部件也会不一样, 而工厂模式创建出来的对象都一样或者是一系列的产品族
 *      => 如果将抽象工厂模式看成汽车配件生产工厂, 生产一个产品族的产品, 那么建造者模式就相当于一个汽车组装工厂, 通过对部件的组装生成出一辆完整的汽车
 * H. Relation:
 *      a. http://c.biancheng.net/view/1354.html
 *      b. https://www.jianshu.com/p/3d1c9ffb0a28
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 1、案例1
         */
        Director directorA =  new Director(new ConcreteBuildA());
        Director directorB =  new Director(new ConcreteBuildB());

        // 获取产品A
        System.out.println(directorA.assembledProduct().toString());

        System.out.println();

        // 获取产品B
        System.out.println(directorB.assembledProduct().toString());

        System.out.println();

        /**
         * 2、案例2-改造多参数构造对象
         *      A. 优点:
         *          a. 当构造方法的参数多时, 使用建造者模式将使得传递参数更加灵活, 代码具有更高的可读性
         */
        // 多参数构造对象
        Computer computer = new Computer("cpu", "screen", "memory", "mainboard");
        System.out.println(computer.toString());

        System.out.println();

        // 建造者模式构造对象
        NewComputer newComputer = new NewComputer.Builder()
                .cpu("cpu")
                .screen("screen")
                .memory("memory")
                .mainboard("mainboard")
                .build();
        System.out.println(newComputer.toString());
    }

}
