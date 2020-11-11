package com.jsonyao.cs.commandPattern.commandSample;

/**
 * 灯灭具体命令
 */
public class LightOffCommand implements Command{

    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
