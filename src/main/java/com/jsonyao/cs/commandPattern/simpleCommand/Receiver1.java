package com.jsonyao.cs.commandPattern.simpleCommand;

/**
 * 接收者1
 */
public class Receiver1 implements Receiver {

    @Override
    public void action() {
        System.out.println("接收者1执行命令....");
    }

}
