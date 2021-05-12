package com.jsonyao.cs.commandPattern.commandSample;

/**
 * 转上一个台具体命令
 */
public class TurnUpCommand implements Command{

    private Receiver receiver;

    public TurnUpCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnUp();
    }

    @Override
    public void undo() {
        receiver.turnDown();
    }

}
