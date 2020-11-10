package com.jsonyao.cs.commandPattern.simpleCommand;

/**
 * 具体命令1
 */
public class ConcreteCommand1 implements Command{

    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        System.out.println("创建具体命令1...");
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
