package com.jsonyao.cs.factoryPattern.simpleFatory;

public class SimpleFatory {

    public Product createProduct(String type){
        switch (type){
            case "HighLvA":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                break;
        }

        return null;
    }

}
