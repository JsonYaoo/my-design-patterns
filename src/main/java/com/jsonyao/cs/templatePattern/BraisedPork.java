package com.jsonyao.cs.templatePattern;

/**
 * 红烧肉
 */
public class BraisedPork extends DodishTemplate{

    @Override
    protected void preparation() {
        System.out.println("切猪肉和土豆...");
    }

    @Override
    protected void doing() {
        System.out.println("将切好的猪肉倒入锅中炒一会然后倒入土豆连炒带炖...");
    }

    @Override
    protected void carriedDishes() {
        System.out.println("将做好的红烧肉盛进碗里端给客人吃...");
    }

}
