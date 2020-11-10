package com.jsonyao.cs.commandPattern.simpleCommand;

/**
 * 简单命令模式
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
