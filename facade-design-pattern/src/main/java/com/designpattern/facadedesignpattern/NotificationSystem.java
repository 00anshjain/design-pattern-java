package com.designpattern.facadedesignpattern;

public class NotificationSystem {
    void sendEmail(User user, String bookingId) {
        System.out.println("Email sent successfully with booking id " + bookingId + " for user : " + user.getName());
    }

    void sendSms(User user, String bookingId) {
        System.out.println("SMS sent successfully with booking id " + bookingId + " for user : " + user.getName());
    }

}
