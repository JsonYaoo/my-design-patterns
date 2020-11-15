package com.jsonyao.cs.BuilderPattern;

/**
 * 2、新电脑类-改造多参数构造对象
 */
public class NewComputer {

    private String cpu;

    private String screen;

    private String memory;

    private String mainboard;

    public NewComputer() {
        throw new RuntimeException("该类不能直接调用无参构造函数...");
    }

    // 引用Builder内部类进行成员变量赋值
    private NewComputer(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    // Builder内部类
    public static final class Builder {

        private String cpu;

        private String screen;

        private String memory;

        private String mainboard;

        public Builder() {

        }

        public Builder cpu(String val){
            cpu = val;
            return this;
        }

        public Builder screen(String val){
            screen = val;
            return this;
        }

        public Builder memory(String val){
            memory = val;
            return this;
        }

        public Builder mainboard(String val){
            mainboard = val;
            return this;
        }

        public NewComputer build(){
            return new NewComputer(this);
        }
    }

    @Override
    public String toString() {
        return "NewComputer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
