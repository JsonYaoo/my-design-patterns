package com.jsonyao.cs.observerPattern;

/**
 * 会计类
 */
public class Accountant implements JobStation{

    private String state;

    private CustomerSubject customerSubject;

    public Accountant(CustomerSubject customerSubject) {
        this.customerSubject = customerSubject;
    }

    @Override
    public void updateJobState() {
        if(customerSubject.getState().equals("已付款")){
            this.state = "已开发票";
            System.out.println(String.format("我是会计, 我来开具发票 => %s.", this.state));
        }
    }
}
