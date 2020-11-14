package com.jsonyao.cs.templatePattern;

/**
 * 番茄炒蛋
 */
public class EggsWithTomato extends DodishTemplate{

    @Override
    protected void preparation() {
        System.out.println("洗并切西红柿, 打鸡蛋...");
    }

    @Override
    protected void doing() {
        System.out.println("鸡蛋倒入锅里, 然后倒入西红柿一起炒...");
    }

    @Override
    protected void carriedDishes() {
        System.out.println("将炒好的西红寺鸡蛋装入碟子里, 端给客人吃...");
    }

}
