package com.jsonyao.cs.observerPattern;

/**
 * 出纳类
 */
public class Cashier implements JobStation{

    private String state;

    private CustomerSubject customerSubject;

    public Cashier(CustomerSubject customerSubject) {
        this.customerSubject = customerSubject;
    }

    @Override
    public void updateJobState() {
        if(customerSubject.getState().equals("已付款")){
            this.state = "已入账";
            System.out.println(String.format("我是出纳员, 我来登记入账 => %s.", this.state));
        }
    }
}
