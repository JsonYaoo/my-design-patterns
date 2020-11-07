package com.jsonyao.cs.SixPrinciples.singleResponsibilityPrinciple;

/**
 * 单一职责原则-案例分析
 */
public class SingleResPrinciple {

    public static void test() {
        /**
         * 1、初始案例
         *      A. 案例详情:
         *          a. 刚开始, 因为公司是刚成立, 前期用户没什么需求, 产品提的需求很简单
         */
//        Animal.eat("牛");
//        Animal.eat("马");
//        Animal.eat("羊");

        /**
         * 2、案例修改方案1
         *      A. 案例详情:
         *          a. 违背单一职责原则, 直接在Animal类上修改, 花销小
         *      B. 优点:
         *          a. 修改方法简单, 开发迅速, 时间花费少
         *      C. 缺点:
         *          a. 代码存在隐患, 当产品再次升级, 需要对食草动物再细分, 则有需要修改eat方法, 这样修改可能会给肉食动物eat行为带来风险
         *          b. 这种修改方式在代码级别上违背了单一职责原则, 隐患最大
         */
//        Animal1.eat("牛");
//        Animal1.eat("马");
//        Animal1.eat("羊");
//
//        Animal1.eat("老虎");

        /**
         * 3、案例修改方案2
         *      A. 案例详情:
         *          a. 新增吃肉eat2方法, 赋予动物不同eat行为, 然后分别调用
         *      B. 优点:
         *          a. 这种修改方法没有改动原来的方法, 而是在类中新增了一个方法, 虽然也违背了类的单一职责原则,
         *             但是在方法级别上却是符合单一职责原则的
         *          b. 花销较小
         *      C. 缺点:
         *          a. 违背了类的单一职责原则
         */
//        Animal2.eat("牛");
//        Animal2.eat("马");
//        Animal2.eat("羊");
//
//        Animal2.eat2("老虎");

        /**
         * 4、案例修改方案3
         *      A. 案例详情:
         *          a. 用户需要提供吃肉的服务, 这时就不得不修改代码
         *          b. 遵循单一职责原则, 需要将Animal类细分为草食动物类Herbivore和肉食动物类Predator
         *      B. 优点:
         *          a. 遵循了单一职责原则
         *      C. 缺点:
         *          a. 因为直把Animal类拆出了Herbivore类和Predator类来达成目的, 但花销最大
         */
        Herbivore.eat("牛");
        Herbivore.eat("马");
        Herbivore.eat("羊");

        Predator.eat("老虎");
    }
}
