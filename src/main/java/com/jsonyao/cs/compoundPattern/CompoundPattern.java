package com.jsonyao.cs.compoundPattern;

/**
 * 复合模式(MVC模式):
 * A. 概念:
 *      a. 将多个模式结合起来形成一个框架, 以解决一般性问题, 在形式上, 复合模式是多个模式的结合
 * B. 场景:
 *      a. MVC就是典型的多个模式结合:
 *          a.1. 观察者模式: V和C都是M的观察者, Model的状态更新要及时通知V更新视图, 或者通知C做相应逻辑处理
 *          a.2. 策略模式: C是V的策略, 所以V包含的控制逻辑就是选择策略, 也就是选择控制器Controller
 *          a.3. 组合模式: V的自身实现应用了组合模式, 即调用顶层容器的repaint方法, 容器内的所有组件都会进行重绘
 *      => MVC应用了多个模式, 并能够较好的解决设计上的一般性问题, 所以被成为复合模式, 但应用复合模式的框架远不止MVC一个
 *  C. Relation:
 *      a. https://www.cnblogs.com/ayqy/p/4023367.html
 */
public class CompoundPattern {
}
