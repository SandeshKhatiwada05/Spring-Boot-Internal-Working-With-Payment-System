package com.payment.payment;

import org.springframework.stereotype.Component;

@Component
public class EsewaPayService implements Payment {
    @Override
    public String pay() {
        String payment = "Esewa Payment Service";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
