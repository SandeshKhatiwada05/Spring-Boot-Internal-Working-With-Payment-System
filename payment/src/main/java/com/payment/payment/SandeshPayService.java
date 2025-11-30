package com.payment.payment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component

//All these below mean the same
//@Service
//@RestController
//@Repository
//if there are multiple beans then this selects the main bean class
//@Primary
//here we use two payment methods where this one is chosen as primary

@ConditionalOnProperty(name = "transaction_method", havingValue = "sandesh")
public class SandeshPayService implements Payment{

    public String pay(){
        String payment = "Sandesh Payment Service";
        System.out.println("Payment from: "+ payment);
        return payment;
    }
}

