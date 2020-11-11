package com.jsonyao.cs.commandPattern.commandSample;

/**
 * 命令模式简单例子
 * A. 内容:
 *      a. 制作一个简易的电视遥控器, 其中有两个按钮, 分别控制上一个台和下一个台
 * B. Relation:
 *      a. https://www.cnblogs.com/jmcui/p/10042235.html
 *      b. https://www.jianshu.com/p/35bbfc835e12
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        RemoteInvoker remoteInvoker = new RemoteInvoker(new TurnUpCommand(receiver), new TurnDownCommand(receiver));

        // 操作遥控器
        remoteInvoker.turnDownButton();
        remoteInvoker.turnUpButton();
        remoteInvoker.undoButton();
        remoteInvoker.undoButton();
        remoteInvoker.redoButton();
        remoteInvoker.redoButton();
    }

}
