package com.jsonyao.cs.commandPattern.commandSample;

import java.util.Stack;

/**
 * 遥控器调用者
 */
public class RemoteInvoker {

    private Command turnUpCommand;
    private Command turnDownCommand;

    private Stack<Command> undoCommadStack;
    private Stack<Command> redoCommadStack;

    public RemoteInvoker(Command turnUpCommand, Command turnDownCommand) {
        this.turnUpCommand = turnUpCommand;
        this.turnDownCommand = turnDownCommand;

        undoCommadStack = new Stack<>();
        redoCommadStack = new Stack<>();
    }

    // 遥控器-切上一个台的按钮实现
    public void turnUpButton(){
        turnUpCommand.execute();
        undoCommadStack.push(turnUpCommand);
        if(!redoCommadStack.isEmpty()){
            redoCommadStack.clear();
        }
    }

    // 遥控器-切下一个台的按钮实现
    public void turnDownButton(){
        turnDownCommand.execute();
        undoCommadStack.push(turnDownCommand);
        if(!redoCommadStack.isEmpty()){
            redoCommadStack.clear();
        }
    }

    // 遥控器-undo按钮实现
    public void undoButton(){
        if(!undoCommadStack.isEmpty()){
            Command command = undoCommadStack.pop();
            command.undo();
            redoCommadStack.push(command);
        }else {
            System.out.println("按钮无效...");
        }
    }

    // 遥控器-redo按钮实现
    public void redoButton(){
        if(!redoCommadStack.isEmpty()){
            redoCommadStack.pop().execute();
        }else {
            System.out.println("按钮无效...");
        }
    }
}
