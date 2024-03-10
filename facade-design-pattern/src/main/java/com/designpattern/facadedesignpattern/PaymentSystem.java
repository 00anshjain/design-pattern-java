package com.designpattern.facadedesignpattern;

public class PaymentSystem {
    void chargeCard(User user) {
        System.out.println("Payment Successful for booking ticket for User : " + user.getName());
    }
}
