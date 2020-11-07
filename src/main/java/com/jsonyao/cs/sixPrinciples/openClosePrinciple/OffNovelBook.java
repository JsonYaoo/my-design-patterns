package com.jsonyao.cs.sixPrinciples.openClosePrinciple;

/**
 * 4、案例4-故事书类, 扩展getPrice方法
 */
public class OffNovelBook extends NovelBook{

    private String name;

    private String author;

    private Double price;

    public OffNovelBook() {

    }

    public OffNovelBook(String name, String author, Double price) {
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
