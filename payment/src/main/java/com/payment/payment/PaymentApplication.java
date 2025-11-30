package com.payment.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

//    Field Annotation
//    @Autowired
//    private SandeshPayService sandeshPayService;

    //Dependency Injection
    private final Payment payment;

    public PaymentApplication(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void run(String... args) throws Exception {
        String paymentt = payment.pay();
        System.out.println("Payment done: " + paymentt);
    }
}
