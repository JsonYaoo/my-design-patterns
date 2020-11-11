package com.jsonyao.cs.commandPattern.commandSample;

/**
 * 遥控器调用者
 */
public class RemoteInvoker {

    // 开命令
    private Command onCommand;

    // 关命令
    private Command offCommand;

    // 撤销命令
    private Command undoCommand;

    public RemoteInvoker(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    // 遥控器-on按钮实现
    public void onButton(){

        // 执行命令
        onCommand.execute();

        // 保存撤销命令
        undoCommand = onCommand;
    }

    // 遥控器-off按钮实现
    public void offButton(){
        // 执行命令
        offCommand.execute();

        // 保存撤销命令
        undoCommand = offCommand;
    }

    // 遥控器-undo按钮实现
    public void undoButton(){
        undoCommand.undo();
    }
}
