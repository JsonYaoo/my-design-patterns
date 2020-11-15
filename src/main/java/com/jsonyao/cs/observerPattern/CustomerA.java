package com.jsonyao.cs.observerPattern;

/**
 * 具体客户类A
 */
public class CustomerA extends CustomerSubject {

    @Override
    public void payOrder() {
        super.setState("已付款");
        System.out.println("我是用户, 我已经完成订单付款...");
        for(JobStation jobStation : super.getObservers()){
            jobStation.updateJobState();
        }
    }

}
