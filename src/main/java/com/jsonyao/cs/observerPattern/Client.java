package com.jsonyao.cs.observerPattern;

/**
 * 观察者模式
 * A. 概念:
 *      a. 观察者模式, 又称模型视图(MV)模式、源-收听者模式、从属者模式、发布订阅模式, 是软件设计模式中的一种
 *      b. 在此模式中, 一个目标物件管理所有相依于它的观察者物件, 并且在它本身的状态改变时主动发出通知, 通常是透过呼叫各观察者所提供的方法来实现,
 *         因此, 观察者模式通常被用来实现事件处理系统
 *      c. 定义对象间的一种一对多的依赖关系, 当一个对象的状态发生改变时, 所有依赖于它的对象都得到通知并被自动更新, 完美地将观察者模式和被观察者的对象分离开,
 *         在模块之间划定了清晰的界限, 提高了应用程序的可维护性和重用性
 * B. 解决的问题:
 *      a. 将一个系统分割成一些类相互协作的类有一个不好的副作用, 那就是需要维护相关对象之间的一致性, 当不希望为了维持一致性而使各类紧密耦合导致会给维护、
 *         扩展和重用都带来不便时, 可以使用观察者模式来解决这类耦合关系
 * C. 角色:
 *      a. 抽象主题(Subject):
 *          a.1. 它把所有观察者对象的引用保存到一个聚集里, 每个主题都可以有任意数量的观察者
 *          a.2. 抽象主题提供一个接口, 可以增加和删除观察者对象
 *      b. 具体主题(Concrete Subject):
 *          b.1. 将有关状态存入具体观察者对象, 在具体主题内部状态改变时, 给所有登记过的观察者发出通知
 *      c. 抽象观察者(Observer):
 *          c.1. 为所有具体的观察者定义一个接口, 在得到主题通知时更新自己
 *      d. 具体观察者(Concrete Observer):
 *          d.1. 实现抽象观察者角色所要求的更新接口, 以便使本身的状态与主题状态协调
 * D. 优点:
 *      a. 观察者模式解除了主题和具体观察者的耦合, 让耦合的双方都依赖于抽象, 不依赖具体, 从而使得各自的变化都不会影响另一边的变化
 * E. 缺点:
 *      a. 在应用观察者模式时需要考虑以下开发小路问题, 程序中包括一个被观察者和多个观察者, 开发和调试比较复杂, 而且Java中的消息通知默认是顺序执行的,
 *         一个观察者的卡顿会影响整体的执行效率, 因此, 在这种情况下, 一般考虑采用异步的方式
 *      b. 依赖关系并未完全解除, 抽象通知者依旧依赖抽象的观察者, 这时可以采用委托的方式(引用方法类型)来解决
 * F. 使用场景:
 *      a. 当一个抽象模型有两个方面, 其中一个方面依赖于另一个方面, 需要将二者封装在独立的对象中以使它们可以各自独立地改变和复用时
 *      b. 当一个对象地改变需要同时改变其他对象, 但又不知道具体有多少对象需要改变时
 *      c. 当一个对象必须通知其他对象, 但它又不知道其他对象是谁时, 也就是希望这些对象之间不是紧密耦合的
 * G. Relation:
 *      a. https://baike.baidu.com/item/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F/5881786?fr=aladdin
 *      b. https://www.cnblogs.com/wangjq/archive/2012/07/12/2587966.html
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 1、例子一
         */
        Subject concreteSubject = new ConcreteSubject("Ready");
        Subject concreteSubject2 = new ConcreteSubject("Ready");
        concreteSubject.addObserver(new ConcreteObserver("Observer A", concreteSubject));
        concreteSubject2.addObserver(new ConcreteObserver("Observer B", concreteSubject2));

        // 添加观察者C
        Observer observerC = new ConcreteObserver("Observer C", concreteSubject);
        concreteSubject.addObserver(observerC);

        // 主题状态更新, 自动通知观者更新状态
        concreteSubject.setSubjectState("Ready");
        concreteSubject.setSubjectState("Go");
        concreteSubject2.setSubjectState("Go2");

        // 移除观察者C
        concreteSubject.removeObserver(observerC);
        concreteSubject.setSubjectState("Ready");
        concreteSubject2.setSubjectState("Ready2");

        System.out.println();

        /**
         * 2、例子二-业务场景
         */
        CustomerA customerA = new CustomerA();
        customerA.addObserver(new Cashier(customerA));
        customerA.addObserver(new Accountant(customerA));
        customerA.addObserver(new Dilliveryman(customerA));
        customerA.payOrder();
    }

}
