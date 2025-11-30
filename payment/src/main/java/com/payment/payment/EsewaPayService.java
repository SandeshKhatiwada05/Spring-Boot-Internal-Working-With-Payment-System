package com.payment.payment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component

//only the selected one's bean is created
@ConditionalOnProperty(name = "payment.method", havingValue = "esewa")
public class EsewaPayService implements Payment {
    @Override
    public String pay() {
        String payment = "Esewa Payment Service";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
