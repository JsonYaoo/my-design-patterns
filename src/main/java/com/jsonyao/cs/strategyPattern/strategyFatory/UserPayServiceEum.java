package com.jsonyao.cs.strategyPattern.strategyFatory;

/**
 * 用户支付服务枚举类
 */
public enum UserPayServiceEum {

    NORMAL(1, "Normal"),// 普通用户
    VIP(2, "Vip"),// vip用户
    SUPERVIP(3, "SuperVip"),// 超级vip用户
    PARTICULALYVIP(4, "ParticularlyVip");// 专用vip用户

    private int code;

    private String value;

    UserPayServiceEum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static UserPayServiceEum valueOf(int code){
        for(UserPayServiceEum userPayServiceEum : UserPayServiceEum.values()){
            if(userPayServiceEum.getCode() == code){
                return userPayServiceEum;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(UserPayServiceEum.NORMAL.code);
    }
}
