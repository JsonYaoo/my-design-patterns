package com.jsonyao.cs.strategyPattern.simpleStrategyPattern;

/**
 * 具体策略A
 */
public class StrategyA implements Strategy{

    @Override
    public void algorithmLogic() {
        System.out.println("这是策略A...");
    }

}
