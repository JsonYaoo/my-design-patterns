package com.jsonyao.cs.sixPrinciples.openClosePrinciple;

/**
 * 2、案例2: 书籍接口-含获取打折后的书价
 */
public interface IBook2 {

    public String getName();

    public String getAuthor();

    public Double getPrice();

    public Double getOffPrice();

}
