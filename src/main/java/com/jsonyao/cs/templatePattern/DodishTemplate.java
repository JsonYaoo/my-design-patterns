package com.jsonyao.cs.templatePattern;

/**
 * 做菜的抽象父类
 */
public abstract class DodishTemplate {

    /**
     * 做菜, 定义算法骨架
     */
    protected void dodish(){
        this.preparation();
        this.doing();
        this.carriedDishes();
    }

    /**
     * 备菜
     */
    protected abstract void preparation();

    /**
     * 做菜
     */
    protected abstract void doing();

    /**
     * 上菜
     */
    protected abstract void carriedDishes();

}
