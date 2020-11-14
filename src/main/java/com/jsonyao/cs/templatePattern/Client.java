package com.jsonyao.cs.templatePattern;

/**
 * 模板(方法)模式
 * A. 概念:
 *      a. 定义一个操作中算法的骨架, 而将一些步骤延迟到子类中, 模板方法使得子类可以不改变算法的结构即可重定义该算法的某些特定步骤
 * B. 结构:
 *      a. 抽象父类: 实现了模板方法, 定义了算法的骨架
 *      b. 具体类: 实现抽象类的抽象方法, 即不同对象的具体细节
 * C. 优点:
 *      a. 具体细节步骤实现定义在子类中, 子类定义详细处理算法不会改变算法整体结构
 *      b. 代码复用的基本技术, 在数据库设计中尤为重要
 *      c. 存在一种反向的控制结构, 通过一个父类调用其子类的操作, 通过子类对父类进行扩展增加新的行为, 符合开闭原则
 * D. 缺点:
 *      a. 每个不同的实现都需要定义一个子类, 会导致类的个数增加, 系统更加庞大
 * E. Relation:
 *      a. https://www.cnblogs.com/qq-361807535/p/6854191.html
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 模板方法模式:
         * A. 例子:
         *      a. 假设做菜有3步: 备料、做菜、上菜, 这三步是算法的骨架
         *      b. 然后做不同菜需要不同的料, 做时不同的方法, 以及如何盛装给客人, 这些就是不同的实现细节
         */
        // 番茄炒蛋
        DodishTemplate eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println();

        // 红烧肉
        DodishTemplate braisedPork = new BraisedPork();
        braisedPork.dodish();
    }
}
