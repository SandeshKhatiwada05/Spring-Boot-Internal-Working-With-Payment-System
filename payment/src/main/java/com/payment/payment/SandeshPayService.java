package com.payment.payment;

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
@Primary //if there are multiple beans then this selectes the main bean class
//here we use two payment methods where this one is chosen as primary
public class SandeshPayService implements Payment{

    public String pay(){
        String payment = "Sandesh Payment Service";
        System.out.println("Payment from: "+ payment);
        return payment;
    }
}

