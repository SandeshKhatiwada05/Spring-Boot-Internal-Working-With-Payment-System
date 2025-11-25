package com.payment.payment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

    //Dependency Injection
    private SandeshPayService sandeshPayService;
    public PaymentApplication(SandeshPayService sandeshPayService){
        this.sandeshPayService = sandeshPayService;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment = sandeshPayService.pay();
        System.out.println("Payment done: "+payment);
    }
}
