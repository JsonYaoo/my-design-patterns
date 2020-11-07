package com.jsonyao.cs.SixPrinciples.DimitsLaw;

/**
 * 迪米特法则(最小知道原则)-案例分析
 */
public class DimitsLaw {

    public static void test() {
        /**
         * 1、案例1:
         *      A. 案例详情:
         *          a. 老师让班长清点全班同学人数, 通过老师创建学生数组
         *      B. 缺点：
         *          a. 可以看见, 老师类中的CommadMonitor方法体里出现了Student类, 导致自己的行为和其他的类产生了依赖关系,
         *             所以违反了迪米特法则
         *      C. 总结：
         *          a. 降低依赖的耦合的一种手段, 尽量不要在方法体里出现类的依赖
         */
//        Teacher teacher = new Teacher1();
//        teacher.commadMonitor(new Monitor1());

        /**
         * 2、案例2:
         *      A. 案例详情:
         *          a. 老师让班长清点全班同学人数, 通过班长构造函数创建学生数组
         *      B. 优点：
         *          a. 可以看见, 老师类里只和班长直接交流, 班长类也只和学生直接交流, 遵循了迪米特法则
         *          b. 修改后, 每个类都只和直接的朋友交流, 有效减少了类之间的耦合
         */
//        Student[] students = new Student[3];
//        students[0] = new Student(1, "张三");
//        students[1] = new Student(2, "李四");
//        students[2] = new Student(3, "王五");
//
//        Monitor monitor = new Monitor1();
//        monitor.addStudents(students);
//
//        Teacher teacher = new Teacher2();
//        teacher.commadMonitor(monitor);

        /**
         * 3、案例3:
         *      A. 案例详情:
         *          a. 一个人用咖啡机煮咖啡
         *      B. 缺点:
         *          a. 本例中, CoffeeMachine时Person的直接朋友, 可以直接交流, 但是Person只需要使用CoffeeMachine就行, 根本不需要关心
         *             咖啡机的具体制作过程(这里假设咖啡机是全自动的)
         *          b. 所以, 咖啡机的加咖啡豆、加水的操作, 对于Person根本不需要, 违反了迪米特法则
         */
//        Person person = new Person1();
//        CoffeeMachine coffeeMachine = new ConffeeMachine1();
//
//        person.addCoffeeMachine(coffeeMachine);
//        person.makeCoffee();

        /**
         * 4、案例4:
         *      A. 案例详情:
         *          a. 一个人用咖啡机煮咖啡, 人只会使用咖啡机, 而咖啡机负责加咖啡豆、加水、煮咖啡
         *      B. 优点:
         *          a. 减少了人对咖啡机加咖啡豆、加水的操作, 人不用去了解咖啡机的运作原理, 从而降低了它们的耦合
         *      C. 总结:
         *          a. 只要做到只和直接的朋友交流(减少对其他类的依赖)和减少对朋友的了解(减少对外暴露的方法), 就能满足迪米特法则
         */
        Person person = new Person2();
        CoffeeMachine coffeeMachine = new ConffeeMachine2();

        person.addCoffeeMachine(coffeeMachine);
        person.makeCoffee();
    }

}
