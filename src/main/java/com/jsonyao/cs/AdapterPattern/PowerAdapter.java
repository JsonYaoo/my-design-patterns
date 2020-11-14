package com.jsonyao.cs.AdapterPattern;

/**
 * 类的适配器模式-电视机电源适配器
 */
public class PowerAdapter extends Power implements TvPlug {

    @Override
    public void converTo110v() {
        super.supply220v();
        System.out.println("开启转换电压...");
    }
}
