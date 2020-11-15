package com.jsonyao.cs.BuilderPattern;

/**
 * 具体建造者类A
 */
public class ConcreteBuildA extends Builder{

    @Override
    public void buildPartA() {
        if(super.product == null){
            throw new RuntimeException("请先构建空产品");
        }

        super.product.setPartA("我是A Part A.");
        System.out.println("A建造者建造了Part A...");
    }

    @Override
    public void buildPartB() {
        if(super.product == null){
            throw new RuntimeException("请先构建空产品");
        }

        super.product.setPartB("我是A Part B.");
        System.out.println("A建造者建造了Part B...");
    }

    @Override
    public void buildPartC() {
        if(super.product == null){
            throw new RuntimeException("请先构建空产品");
        }

        super.product.setPartC("我是A Part C.");
        System.out.println("A建造者建造了Part C...");
    }
}
