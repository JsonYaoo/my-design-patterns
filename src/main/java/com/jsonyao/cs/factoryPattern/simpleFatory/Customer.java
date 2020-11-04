package com.jsonyao.cs.factoryPattern.simpleFatory;

import com.jsonyao.cs.factoryPattern.initial.ProductA;
import com.jsonyao.cs.factoryPattern.initial.ProductB;

/**
 * 消费类
 */
public class Customer {

    public static void main(String[] args) {
        SimpleFatory simpleFatory = new SimpleFatory();
        simpleFatory.createProduct("A");
        simpleFatory.createProduct("B");
    }

}
