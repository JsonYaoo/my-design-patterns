package com.jsonyao.cs.commandPattern.simpleCommand;

/**
 * 具体命令2
 */
public class ConcreteCommand2 implements Command{

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        System.out.println("创建具体命令2...");
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
