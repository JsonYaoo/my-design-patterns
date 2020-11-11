package com.jsonyao.cs.commandPattern.commandSample;

/**
 * 命令模式简单例子
 * A. 内容:
 *      a. 制作一个简易的遥控器, 其中有两个控制灯开关的按钮, 一个操作回退按钮
 * B. Relation:
 *      a. https://www.cnblogs.com/jmcui/p/10042235.html
 */
public class Client {

    public static void main(String[] args) {
        // 创建灯具接收者
        LightReceiver lightReceiver = new LightReceiver();

        // 创建具体命令
        Command onCommand = new LightOnCommand(lightReceiver);
        Command offCommand = new LightOffCommand(lightReceiver);

        // 创建远程遥控器
        RemoteInvoker remoteInvoker = new RemoteInvoker(onCommand, offCommand);

        // 打开灯具
        remoteInvoker.onButton();

        // 关闭灯具
        remoteInvoker.offButton();

        // 撤销关闭
        remoteInvoker.undoButton();
    }

}
