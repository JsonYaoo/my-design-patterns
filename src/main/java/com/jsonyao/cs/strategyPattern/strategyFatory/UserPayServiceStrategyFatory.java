package com.jsonyao.cs.strategyPattern.strategyFatory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略工厂-反射实现
 */
public class UserPayServiceStrategyFatory {

    private static Map<String, Class<? extends UserPayService>> services = new ConcurrentHashMap<>();

    static {
        services.put(UserPayServiceEum.NORMAL.getValue(), NormalPayService.class);
        services.put(UserPayServiceEum.VIP.getValue(), VipPayService.class);
        services.put(UserPayServiceEum.SUPERVIP.getValue(), SuperVipPayService.class);
        services.put(UserPayServiceEum.PARTICULALYVIP.getValue(), ParticularlyVipPayService.class);
    }

    public static UserPayService getServiceByUserType(String type){
        Class<? extends UserPayService> service = services.get(type);
        try {
            return service.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return new NormalPayService();
        }
    }

}
