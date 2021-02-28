package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

//统一异常处理，需要实现接口，在方法中处理fallback,解耦代码
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentinfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
