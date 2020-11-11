package com.jsonyao.cs.commandPattern.simpleCommand;

/**
 * 命令执行发起者
 */
public class Invoker {

    private Command command1;

    private Command command2;

    public Invoker(Command command1, Command command2) {
        this.command1 = command1;
        this.command2 = command2;
    }

    // 发起命令1
    public void call1(){
        command1.excute();
    }

    // 发起命令2
    public void call2(){
        command2.excute();
    }
}
