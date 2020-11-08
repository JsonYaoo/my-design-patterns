package com.jsonyao.cs.strategyPattern.simpleStrategyPattern;

/**
 * 具体策略B
 */
public class StrategyB implements Strategy{

    @Override
    public void algorithmLogic() {
        System.out.println("这是策略B...");
    }

}
