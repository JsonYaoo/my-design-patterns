package com.jsonyao.cs.SixPrinciples.LiSubstitutionPrinciple;

/**
 * 里氏替换原则-案例分析
 */
public class LiSubPrinciple {

    public static void test() {
        /**
         * 1、案例1
         *      A. 案例详情
         *          a. A类完成两数相减
         */
//        A a = new A();
//        System.out.println("100 - 50 = " + a.mySubtract(100, 50));
//        System.out.println("100 - 80 = " + a.mySubtract(100, 80));

        /**
         * 2、案例2
         *      A.案例详情
         *          a. 需要增加两数相加的功能 以及 两数相加后再与100求和的功能
         *          b. 这里使用B类来继承A类, 重写myCount方法, 用于实现两数相加
         *      B. 缺点：
         *          a. 运行结果
         *             => 100 - 50 = 150
         *             => 100 - 80 = 180
         *             => (100 + 20) + 100 = 250
         *          b. 可见如果乱用继承, 在子类无意重写了父类的方法, 可能会造成本来运行相减的代码, 通过子类B调用时出现功能错误的问题
         */
//        B b = new B();
//        System.out.println("100 - 50 = " + b.mySubtract(100, 50));
//        System.out.println("100 - 80 = " + b.mySubtract(100, 80));
//        System.out.println("(100 + 20) + 100 = " + b.myAdd100(100, 50));

        /**
         * 3、案例3
         *      A. 案例详情
         *          a. 通过组合依赖完成新增功能
         *      B. 优点:
         *          a. 拆除了原来的继承关系, 采用了组合依赖的关系代替
         */
        B2 b2 = new B2();
        System.out.println("100 - 50 = " + b2.mySubtract(100, 50));
        System.out.println("100 - 80 = " + b2.mySubtract(100, 80));
        System.out.println("(100 + 20) + 100 = " + b2.myAdd100(100, 50));
    }
}
