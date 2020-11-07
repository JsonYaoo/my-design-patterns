package com.jsonyao.cs.sixPrinciples.openClosePrinciple;

/**
 * 2、案例2-故事书类-含获取打折后的书价
 */
public class NovelBook2 implements IBook2{

    private String name;

    private String author;

    private Double price;

    public NovelBook2() {

    }

    public NovelBook2(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public Double getOffPrice() {
        if(Double.valueOf("40").compareTo(price) == 1){
            return price * 0.8;
        }

        return price;
    }
}
