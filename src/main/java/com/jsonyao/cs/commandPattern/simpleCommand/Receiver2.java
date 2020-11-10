package com.jsonyao.cs.commandPattern.simpleCommand;

/**
 * 接收者2
 */
public class Receiver2 implements Receiver {

    @Override
    public void action() {
        System.out.println("接收者2执行命令....");
    }

}
