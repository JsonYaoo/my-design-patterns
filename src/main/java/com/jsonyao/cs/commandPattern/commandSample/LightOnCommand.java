package com.jsonyao.cs.commandPattern.commandSample;

/**
 * 灯亮具体命令
 */
public class LightOnCommand implements Command{

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
