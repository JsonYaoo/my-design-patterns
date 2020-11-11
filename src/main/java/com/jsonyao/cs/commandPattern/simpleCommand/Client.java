package com.jsonyao.cs.commandPattern.simpleCommand;

/**
 * 简单命令模式
 * A. 背景:
 *      a. 当需要向某些对象发送请求, 但是并不知道请求的接收者是谁, 也不知道被请求的操作是哪个, 使得请求发送者与请求接收者相解耦
 * B. 定义:
 *      a. 命令模式就是, 将一个请求封装为一个对象, 从而使我们可用不同的请求对客户进行参数化, 对请求排队, 或者记录请求日志, 以及支持可撤销的操作
 * C. 模式结构:
 *      a. Command: 抽象命令类, 抽象出命令对象, 可以根据不同的命令类型, 写出不同的实现类
 *      b. ConcreteCommand: 具体命令类, 实现了抽象命令对象的具体实现
 *      c. Invoker: 调用者/请求者, 请求的发送者, 通过命令对象来执行请求. 一个调用者并不需要在设计时确定其接收者, 因此它只与抽象命令之间存在关联.
 *                  在程序运行时, 将调用命令对象的execute()方法, 间接调用接收者的相关操作
 *      d. Receiver: 接收者, 执行与请求相关的操作, 真正执行命令的对象, 具体实现对请求业务的处理
 *      e. Client: 客户类, 在客户类中创建调用者对象, 具体命令类对象, 在创建具体命令对象时指定对应的接收者
 *          => 可见, 发送者与接收者之间没有关系, 都是通过命令对象来调用, 因此, 两者是解耦的
 * D. 优点:
 *      a. 可以降低系统的耦合度
 *      b. 可以容易地将新的命令加入到系统中
 *      c. 可以容易地设计一个命令队列和宏命令(组合命令)
 *      d. 可以方便地实现对请求的Undo和Redo
 * E. 命令模式的缺点:
 *      a. 由于针对每一个命令都需要设计一个具体命令类, 所以在使用命令模式时可能会导致某些系统有过多的具体命令类, 当某些系统可能需要大量具体命令类时, 将会影响命令模式的使用
 * F. Relation：
 *      a. https://www.cnblogs.com/meet/p/5116430.html
 */
public class Client {

    public static void main(String[] args) {
        Command command1 = new ConcreteCommand1(new Receiver1());
        Command command2 = new ConcreteCommand2(new Receiver2());

        Invoker invoker1 = new Invoker(command1);
        invoker1.call();

        Invoker invoker2 = new Invoker(command2);
        invoker2.call();
    }

}
