package com.jsonyao.cs.sixPrinciples.interfaceIsolationPrinciple;

/**
 * 接口隔离原则-案例分析
 */
public class ItfIsolationPrinciple {

    public static void test() {
        /**
         * 1、案例1
         *      A. 案例详情:
         *          a. A的方法depend1、2、3依赖于B method的1、2、3, C的方法depend1、4、5依赖于D method的1、4、5
         *      B. 缺点:
         *          a. 可以看到, 如果接口过于臃肿, 只要接口中出现的方法, 不管对依赖于它的类有没有用处, 实现类中都必须去实现这些方法, 显然不是好的设计
         *          b. 如果将这个设计为符合接口隔离原则, 就必须对接口I1进行拆分
         */
//        // 正确依赖
//        HighLvA.depend1(new LowLvB());
//        HighLvA.depend2(new LowLvB());
//        HighLvA.depend3(new LowLvB());
//
//        System.out.println("---------");
//
//        HighLvC.depend1(new LowLvD());
//        HighLvC.depend4(new LowLvD());
//        HighLvC.depend5(new LowLvD());
//
//        System.out.println("---------");
//
//        // 错误依赖
//        HighLvA.depend1(new LowLvD());
//        HighLvA.depend2(new LowLvD());
//        HighLvA.depend3(new LowLvD());
//
//        System.out.println("---------");
//
//        HighLvC.depend1(new LowLvB());
//        HighLvC.depend4(new LowLvB());
//        HighLvC.depend5(new LowLvB());

        /**
         * 1、案例2
         *      A. 案例详情:
         *          a. 对接口I1拆分成了I2、I3、I4, I2抽象了method1, I3抽象了method2、3, I4抽象了method4、5
         *          b. 底层模块BB分别实现了I2、I3接口的method1、method2、3; 底层模块DD分别实现了I2、I4接口的method1、method4、5;
         *      B. 缺点:
         *          a. 可以看到, 将一个庞大的接口I1拆分为3个专用的接口采用的就是接口隔离原则, 在程序设计中, 依赖几个专用的接口要比依赖一个综合的接口更灵活
         *          b. 接口是设计时对外部设定的契约, 通过分散定义多个接口, 可以预防未来需求的扩散, 提高系统的灵活性和可维护性
         */
        // 正确依赖
        HighLvAA.depend1(new LowLvBB());
        HighLvAA.depend2(new LowLvBB());
        HighLvAA.depend3(new LowLvBB());

        System.out.println("---------");

        HighLvCC.depend1(new LowLvDD());
        HighLvCC.depend4(new LowLvDD());
        HighLvCC.depend5(new LowLvDD());

        System.out.println("---------");

        // 错误依赖
        HighLvAA.depend1(new LowLvDD());
//        HighLvAA.depend2(new LowLvDD());// 编译报错
//        HighLvAA.depend3(new LowLvDD());// 编译报错

        System.out.println("---------");

        HighLvCC.depend1(new LowLvBB());
//        HighLvCC.depend4(new LowLvBB());// 编译报错
//        HighLvCC.depend5(new LowLvBB());// 编译报错
    }
}
