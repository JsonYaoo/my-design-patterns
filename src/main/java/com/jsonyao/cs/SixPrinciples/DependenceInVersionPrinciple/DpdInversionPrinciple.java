package com.jsonyao.cs.SixPrinciples.DependenceInVersionPrinciple;

/**
 * 依赖倒置原则-案例分析
 */
public class DpdInversionPrinciple {

    public static void test() {
        /**
         * 1、案例1
         *      HighLvA. 案例详情
         *          a. 母亲给孩子讲故事, 照着书读
         */
//        Mother.narrate(new Book());

        /**
         * 2、案例2
         *      HighLvA. 案例详情
         *          a. 假如有一天, 孩子长大了, 需要了解国家大事, 不是看书, 而是看报纸了
         *          b. 这时需要新加入一个报纸类
         *          c. 但母亲narrate方法只能读书, 想要读报纸, 那么就要修改Mother里的方法, 显然不是好的设计
         *          => 原因就在于, Mother与Book之间的耦合度太高, 必须降低他们之间的耦合度才行
         *      B. 解决方案:
         *          a. 书和报纸都属于读物, 让它们都去实现读物的接口, 然后母亲读的是读物, 那么就能完美解决问题了
         *      C. 优点:
         *          a. 这样修改后, 无论以后母亲是想去看网页还是杂志, 都不需要再修改Mother类
         *          => 之所以不希望修改Mother类, 是因为高层模块的Mother类负责完成主要的业务逻辑, 一旦需要对它进行修改, 引入错误的风险极大
         *          b. 采用依赖倒置原则可以给多人并发开发带来便利, 因为Mother类和Book、Newpaper类之间一点关系也没有, 可以同时开工, 互不影响
         *      D. 总结:
         *          a. 所以遵循依赖倒置原则可以降低类之间的耦合度, 提高系统稳定性, 降低修改程序造成的风险
         *          b. 采用依赖倒置原则可以给多人并发开发带来便利, 参与协作开发的人越多、项目越庞大, 采用依赖倒置原则的意义就越大
         */
        Mother2.narrate(new Book2());
        Mother2.narrate(new Newspaper2());
    }
}
