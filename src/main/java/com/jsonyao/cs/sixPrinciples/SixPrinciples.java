package com.jsonyao.cs.sixPrinciples;

import com.jsonyao.cs.sixPrinciples.dependenceInVersionPrinciple.DpdInversionPrinciple;
import com.jsonyao.cs.sixPrinciples.dimitsLaw.DimitsLaw;
import com.jsonyao.cs.sixPrinciples.interfaceIsolationPrinciple.ItfIsolationPrinciple;
import com.jsonyao.cs.sixPrinciples.liSubstitutionPrinciple.LiSubPrinciple;
import com.jsonyao.cs.sixPrinciples.openClosePrinciple.OpenClosePrinciple;
import com.jsonyao.cs.sixPrinciples.singleResponsibilityPrinciple.SingleResPrinciple;

/**
 * 设计模式六大原则:
 * A. 总结:
 *      a. 单一职责原则告诉我们实现类要职责单一
 *      b. 里氏替换原则告诉我们不要破坏继承体系
 *      c. 依赖倒置原则告诉我们要面向接口编程
 *      d. 接口隔离原则告诉我们在设计接口的时候要精简单一
 *      e. 迪米特法则告诉我们要减少对其他类的依赖, 减少对外暴露的方法, 降低耦合
 *      f. 开发原则是总纲, 告诉我们要对扩展开放, 对修改关闭
 * B. Relation：
 *      a. https://www.jianshu.com/p/3f91776c3672
 */
public class SixPrinciples {

    public static void main(String[] args) {
        /**
         * HighLvA. 单一职责原则
         *      a. 概念:
         *          a.1. 一个类只负责一项职责, 不要存在本职责外导致类发生变更的原因
         *      b. 问题由来(不遵守单一职责原则时):
         *          b.1. 类T负责两个不同的职责: 职责P1和职责P2. 当职责P1需求发生改变时, 需要修改类T, 此时就有可能会导致原本运行正常的职责P2功能发生故障
         *          b.2. 原因分析
         *              => 这就是所谓的职责扩散, 因为产品更改了需求, 职责P被分为粒度更细的职责P1和P2
         *      c. 解决方案(遵循单一职责原则):
         *          c.1. 对于职责P1和职责P2分别建立T1类和T2类, T1类负责完成P1功能, T2类负责完成P2功能
         *          c.2. 这样, 当职责P1需求改变时, 只需要修改T1类就可以, 不会使职责P2发生故障风险
         *          c.3. 同理, 当职责P2需求改变时, 也只需要修改T2类即可, 不会使职责P1发生故障风险
         *          c.4. 解决思路
         *              => 在职责扩散到无法控制之前, 立刻对代码进行部分重构
         *      d. 优点:
         *          d.1. 可以降低类的复杂度, 一个类只负责一项职责, 逻辑简单清晰
         *          d.2. 提高类的可读性, 系统的可维护性更高
         *          d.3. 需求变更时出现风险更低, 因为可以降低对其他功能的影响
         *      e. 总结:
         *          e.1. 只有逻辑足够简单, 才可以在代码级别上违反单一职责原则
         *          e.2. 只有类中方法数量足够少, 才可以在方法级别上违反单一职责原则
         *          e.3. 模块化的程序设计以及在员工工作安排上面, 都适用单一职责原则
         */
//        SingleResPrinciple.test();

        /**
         * B. 里式替换原则
         *      a. 概念:
         *          a.1. 子类可以扩展父类的功能, 不能改变父类原有的功能; 子类可以替换父类, 同时方法或者行为不会发生改变
         *          a.2. 定义表述:
             *          a.2.1. 如果每一个类型T1的对象o1, 都有类型为T2的对象o2, 使得以T1定义的所有程序P在所有的对象o1都代换成o2时, 程序P的行为没有发生变化,
             *                 那么类型T2是类型T1的子类型(继承关系)
             *          a.2.2. 所有引用基类的地方必须能透明使用其子类的对象, 即便替换为了子类对象, 方法的功能、行为没有发生改变
         *                  => 这就意味着子类只是对原有父类的功能进行了独有的增强, 本质还是做了相同的事情, 也就是子类可以扩展父类的功能, 但不能改变父类原有的功能
         *      b. 问题由来(不遵守里氏替换原则时):
         *          b.1. 有一个功能P1, 由类A来完成, 现在需要将功能P1进行扩展, 扩展后的功能为P, 其中P由原有的功能P1与新功能P2组成
         *          b.2. 其中新功能P由类A的子类B来完成, 则子类B在完成新功能P2的同时, 有可能会导致原有功能P1发生故障
         *      c. 解决方案(遵守里氏替换原则):
         *          c.1. 类B继承类A时, 除了添加新的方法完成新增功能P2外, 尽量不要重写A的方法, 也尽量不要重载父类A的方法
         *          c.2. 父类中凡是已经实现好的方法, 实际上是等于设定了一系列的规范和契约, 虽然不强制要求所有的子类都必须遵循, 但是如果子类对这些实现方法进行修改,
         *               就会对整个继承体系造成破坏, 当子类要修改时, 必须考虑到所有的子类, 并且如果修改父类后, 那么所有子类的功能都可能会产生故障
         *               => 继承的弊端, 会给程序带来侵入性, 使得程序的可移植性降低, 增加对象间的耦合性
         *      d. 理解:
         *          d.1. 子类可以实现父类的抽象方法, 但不能覆盖父类的非抽象方法
         *          d.2. 子类中可以增加自己独特的方法
         *          d.3. 当子类的方法重载父类的方法时, 方法的前置条件(形参)要比父类方法更宽松
         *          d.4. 当子类的方法实现父类的抽象方法时, 方法的后置条件(返回值)要比父类更严格
         *      e. 优点:
         *          e.1. 如果不遵循里氏替换原则, 一开始程序可能会好好的, 但是在之后迭代的过程中, 代码出现问题的几率会大大增加, 尤其是当另外一个人接手项目之后
         */
//        LiSubPrinciple.test();

        /**
         * C. 依赖倒置原则
         *      a. 概念:
         *          a.1. 高层模块不应该依赖底层模块, 二者都应该依赖其抽象
         *          a.2. 抽象不应该依赖细节, 细节应该依赖抽象
         *      b. 问题由来:
         *          b.1. 类A直接依赖类B, 假如要将类A改为依赖类C, 则必须通过修改类A的代码来完成(比如形参就是类B和类C)
         *          b.2. 这种场景下, 类A一般是高层模块, 负责复杂业务逻辑; 类B和类C是底层模块, 负责基本的原则操作, 这时如果修改了类A,
         *               可能会给程序带来不必要的风险
         *      c. 解决方案:
         *          c.1. 将类A修改为依赖接口I1, 而不是类B和类C, 同时类B和类C实现接口I1, 那么类A就可以通过接口I1, 间接访问类B和类C, 大大降低了修改类A的几率
         *      d. 总结:
         *          d.1. 相对于细节的多变性, 抽象的东西要稳定的多, 以抽象为基础搭建起来的架构要比以细节为基础搭建起来的架构稳定的多,
         *               所以, 依赖倒置原则的核心思想是面向接口编程, 使用接口或者抽象类的目的是制定好规范和契约, 而不去涉及任何具体的操作,
         *               把展现细节的任务交给实现类去完成, 以达到解耦的过程
         *          d.2. 底层模块尽量都要有抽象类或者接口, 高层模块尽量通过抽象类和接口的形式(变量的声明类型是抽象类或接口)访问底层模块
         *          d.3. 使用继承抽象类时, 要遵循里氏替换原则
         */
//        DpdInversionPrinciple.test();

        /**
         * D. 接口隔离原则:
         *      a. 概念:
         *          a.1. 客户端不应该依赖它不需要的接口
         *          a.2. 一个类对另一个类的依赖应该建立在最小的接口上面
         *      b. 问题由来:
         *          b.1. 类A通过接口I1依赖B, 类C也通过I1依赖D, 如果接口I1对于类A和类B来说不是最小接口, 则类B和类D必须去实现他们不需要的方法
         *      c. 解决方案:
         *          c.1. 将臃肿的接口I1拆分为独立的几个接口, 类A和类C分别与他们需要的接口建立依赖关系, 即采用接口隔离原则
         *      b. 理解:
         *          b.1. 建立单一接口, 尽量细化接口, 接口中的方法尽量少
         *          b.2. 为单个类建立专用的接口, 不要包含太多
         *          b.3. 依赖几个专用的接口要比依赖一个综合的接口更灵活, 提高系统的灵活性和可维护性
         *      c. 注意:
         *          c.1. 接口尽量小, 但是要有限度, 过小则导致接口数量过多, 设计复杂化
         *          c.2. 为依赖接口的类定制服务, 只暴露给调用类需要的方法, 建立最小的依赖关系
         *          c.3. 提高内聚, 减少对外交互, 用最少的方法去完成最多的事情
         *      d. 对比单一职责原则:
         *          d.1. 单一职责原则注重的是职责; 而接口隔离原则注重的是对接口依赖的隔离
         *          d.2. 单一职责原则主要是约束类, 其次才是接口和方法, 针对的是程序中的实现和细节; 而接口隔离原则主要约束接口, 针对抽象和程序整体框架的构建
         */
//        ItfIsolationPrinciple.test();

        /**
         * E. 迪米特法则:
         *      a. 概念:
         *          a.1. 迪米特法则在于降低类之间的耦合, 每个类尽量减少对其他类的依赖, 尽量减少对外暴露的方法, 使得功能模块独立, 低耦合
         *          a.2. 定义:
         *              a.2.1. 它要求一个对象应该对其他对象有最少的了解, 所以迪米特法则又叫最少知道原则
         *      b. 理解:
         *          b.1. 减少对其他类的依赖: 只和直接的朋友交流, 即只通过成员变量、方法的输入输出参数对类进行直接注入, 在方法体内部的类就不是直接朋友了
         *          b.2. 减少对外暴露的方法: 减少对朋友的了解解, 即减少一个类对外暴露的方法
         *             => 满足以上两点即满足迪米特法则
         *      c. 注意:
         *          c.1. 虽然可以避免和非直接的类通信, 但是要通信, 必然会通过一个中介来发生联系, 过分地使用迪米特法则, 会产生大量地中介和传递类, 导致系统复杂度变高
         */
//        DimitsLaw.test();

        /**
         * F. 开闭原则:
         *      a. 概念:
         *          a.1. 软件中的对象(类、模块、函数等)应该对于扩展是开放的, 对于修改是关闭的
         *      b. 问题由来:
         *          b.1. 在软件的生命周期内, 因为变化、系统升级和维护等原因, 需要对软件原有代码进行修改时, 可能会将错误引入原本已经测试过的旧版本中, 破坏原有系统
         *      c. 解决方案:
         *          c.1. 遵循开闭原则, 就是为软件实体的未来事件而制定的对现行开发设计进行约束的一个原则,
         *               当软件需要变化时, 尽量通过扩展软件实体的行为实现变化, 而不是通过修改已有的代码来实现变化
         *      b. 理解:
         *          b.1. 当需求发生变化时, 尽量扩展实体的行为来变化, 而不是通过修改已有的代码来实现变化
         *          b.2. 底层模块的变化, 必然有高层模块进行耦合, 它并不意味着不做任何修改
         *          b.3. 这个原则比较虚, 可以通过具体的设计模式去加深理解
         */
        OpenClosePrinciple.test();
    }

}