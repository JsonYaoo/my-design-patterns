package com.jsonyao.cs.BuilderPattern;

/**
 * 2、电脑类-多参数构造对象
 */
public class Computer {

    private String cpu;

    private String screen;

    private String memory;

    private String mainboard;

    public Computer(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
