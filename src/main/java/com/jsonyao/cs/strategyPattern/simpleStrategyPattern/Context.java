package com.jsonyao.cs.strategyPattern.simpleStrategyPattern;

/**
 * 策略封装上下文对象
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用策略
     */
    public void useStrateyAlgorithmLogic(){
        strategy.algorithmLogic();
    }
}
