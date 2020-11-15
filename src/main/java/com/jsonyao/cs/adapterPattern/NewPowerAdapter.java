package com.jsonyao.cs.adapterPattern;

/**
 * 对象的适配器模式-电视机电源适配器
 */
public class NewPowerAdapter {

    private Power power;

    public NewPowerAdapter(Power power) {
        this.power = power;
    }

    public void converTo110v() {
        power.supply220v();
        System.out.println("开启转换电压...");
    }
}
