package com.jsonyao.cs.sixPrinciples.openClosePrinciple;

/**
 * 1、案例1-故事书类
 */
public class NovelBook implements IBook{

    private String name;

    private String author;

    private Double price;

    public NovelBook() {

    }

    public NovelBook(String name, String author, Double price) {
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
}
