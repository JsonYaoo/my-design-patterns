package com.jsonyao.cs.BuilderPattern;

/**
 * 具体建造者类B
 */
public class ConcreteBuildB extends Builder{

    @Override
    public void buildPartA() {
        if(super.product == null){
            throw new RuntimeException("请先构建空产品");
        }

        super.product.setPartA("我是B Part A.");
        System.out.println("B建造者建造了Part A...");
    }

    @Override
    public void buildPartB() {
        if(super.product == null){
            throw new RuntimeException("请先构建空产品");
        }

        super.product.setPartB("我是B Part B.");
        System.out.println("B建造者建造了Part B...");
    }

    @Override
    public void buildPartC() {
        if(super.product == null){
            throw new RuntimeException("请先构建空产品");
        }

        super.product.setPartC("我是B Part C.");
        System.out.println("B建造者建造了Part C...");
    }
}
