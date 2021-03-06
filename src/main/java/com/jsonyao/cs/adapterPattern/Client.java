package com.jsonyao.cs.adapterPattern;

/**
 * 适配器模式
 * A. 概念:
 *      a. 定义一个包装类, 用于包装不兼容接口的对象
 *      b. 把一个类的接口变换成客户端所期待的另一种接口, 从而使原本接口不匹配而无法工作的两个类能够一起工作
 * B. 结构:
 *      a. 包装类: 适配器Adapter
 *      b. 被包装对象: 适配器Adaptee, 即被适配的类
 * C. 分类:
 *      a. 类的适配器模式:
 *          a.1. 使用对象继承的方式实现, 是静态的定义方式
 *          a.2. 在需要同时适配源类和其子类时, 由于类的适配器不能和Adaptee子类一起工作, 所以选择对象的适配器
 *      b. 对象的适配器模式:
 *          a.1. 使用对象组合的方式, 是动态组合的方式
 *          a.2. 在需要重新定义Adaptee部分行为时, 由于类适配器可以重定义Adaptee部分行为, 相当于子类覆盖父类的部分实现方法, 所以选择类的适配器
 *      => 尽量使用对象的适配器模式, 因为多用合成/聚合, 少用继承
 * D. 优点:
 *      a. 更好的复用性:
 *          系统需要使用现有的类, 而此类的接口不符合系统的需要, 那么通过适配器模式就可以让这些功能得到更好的复用
 *      b. 透明、简单:
 *          客户端可以调用同一接口, 因而对客户端来说是透明的, 这样做更简单、更直接
 *      c. 更好的扩展性:
 *          在实现适配器功能的时候, 可以调用自己开发的功能, 从而自然地扩展系统的功能
 *      d. 解耦性:
 *          将目标类和适配者类进行解耦, 通过引入一个适配器类重现现有的适配者类, 而无需修改原有的代码
 *      e. 符合开闭原则:
 *          同一个适配器可以把适配者类和它的子类都适配到目标接口, 可以为不同的接口实现不同的适配器, 而不需要修改待适配类
 * E. 缺点:
 *      a. 过的地使用适配器, 会让系统非常凌乱, 不易整体进行把握
 * F. 使用场景:
 *      a. 系统需要复用现有类, 而该类的接口不符合系统的需求, 可以使用适配器模式, 使得原本由于接口不兼容而不能一起工作的类可以一起工作
 *      b. 多个组件功能类似, 但接口不同意且可能会经常切换时, 可使用适配器模式, 使得客户端通过统一的接口调用它们
 * G. Relation:
 *      a. https://www.jianshu.com/p/9d0575311214
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 1、类的适配器模式
         *      A. 问题:
         *          a. 小明买了一台进口的电视机
         *          b. 冲突: 进口电视机要求电压110v与国内插头标准输出电压220v不兼容
         *          c. 解决方案: 设置一个适配器将插头输出的220v转变成110v
         *      B. 优点:
         *          a. 使用方便, 代码简化:
         *              仅仅引入一个对象, 并不需要额外地字段来引用Power实例
         *      C. 缺点:
         *          a. 高耦合, 灵活性低:
         *              使用对象继承的方式, 是静态的定义方式
         */
//        // 获取进口电视机
//        ImportedTv importedTv = new ImportedTv();
//
//        // 获取电视机电源适配器(实际上是一个电视机插头, 但也是个电源)
//        TvPlug tvPlug = new PowerAdapter();
//
//        // 开始转换电压
//        tvPlug.converTo110v();
//
//        // 开启电视机
//        importedTv.work();

        /**
         * 2、对象的适配器模式:
         *      A. 同样的问题
         *      B. 优点:
         *          a. 灵活性高、低耦合:
         *              采用对象组合的方式, 是动态组合的方式
         *      C. 缺点:
         *          a. 使用复杂:
         *              需要引入对象实例
         */
        // 获取进口电视机
        ImportedTv importedTv = new ImportedTv();

        // 获取新的电视机电源适配器(实际上是一个电视机插头, 但也是个电源)
        NewPowerAdapter newPowerAdapter = new NewPowerAdapter(new Power());

        // 开始转换电压
        newPowerAdapter.converTo110v();

        // 开启电视机
        importedTv.work();
    }
}
