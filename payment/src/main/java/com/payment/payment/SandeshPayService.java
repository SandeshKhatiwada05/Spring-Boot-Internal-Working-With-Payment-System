package com.payment.payment;

import org.springframework.stereotype.Component;

@Component
public class SandeshPayService {

    public String pay(){
        String payment = "Sandesh Payment Service";
        System.out.println("Payment from: "+ payment);
        return payment;
    }
}

