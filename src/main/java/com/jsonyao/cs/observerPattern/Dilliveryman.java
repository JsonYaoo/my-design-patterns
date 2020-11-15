package com.jsonyao.cs.observerPattern;

/**
 * 配送员类
 */
public class Dilliveryman implements JobStation{

    private String state;

    private CustomerSubject customerSubject;

    public Dilliveryman(CustomerSubject customerSubject) {
        this.customerSubject = customerSubject;
    }

    @Override
    public void updateJobState() {
        if(customerSubject.getState().equals("已付款")){
            this.state = "已发货";
            System.out.println(String.format("我是配送员, 我来发货 => %s.", this.state));
        }
    }
}
