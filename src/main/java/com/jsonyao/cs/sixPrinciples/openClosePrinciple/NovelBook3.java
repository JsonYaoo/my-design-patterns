package com.jsonyao.cs.sixPrinciples.openClosePrinciple;

/**
 * 3、案例3-故事书类, 直接修改getPrice方法来获取折扣价
 */
public class NovelBook3 implements IBook{

    private String name;

    private String author;

    private Double price;

    public NovelBook3() {

    }

    public NovelBook3(String name, String author, Double price) {
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
        if(Double.valueOf("40").compareTo(price) == 1){
            return price * 0.8;
        }

        return price;
    }
}
