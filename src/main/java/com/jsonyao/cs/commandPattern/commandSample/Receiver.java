package com.jsonyao.cs.commandPattern.commandSample;

/**
 * 接收者-电视机
 */
public class Receiver {

    public void turnUp(){
        System.out.println("跳转到上一个台...");
    }

    public void turnDown(){
        System.out.println("跳转到下一个台...");
    }

}
