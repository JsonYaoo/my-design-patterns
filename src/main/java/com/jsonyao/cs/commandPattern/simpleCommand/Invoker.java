package com.jsonyao.cs.commandPattern.simpleCommand;

/**
 * 命令执行发起者
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    // 发起命令
    public void call(){
        command.excute();
    }
}
