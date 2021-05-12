package com.jsonyao.cs.commandPattern.commandSample;

/**
 * 转下一个台具体命令
 */
public class TurnDownCommand implements Command{

    private Receiver receiver;

    public TurnDownCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnDown();
    }

    @Override
    public void undo() {
        receiver.turnUp();
    }
}
