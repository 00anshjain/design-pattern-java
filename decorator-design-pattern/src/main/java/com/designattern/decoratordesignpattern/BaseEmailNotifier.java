package com.designattern.decoratordesignpattern;

public class BaseEmailNotifier implements Notifier{
    @Override
    public void sendNotification() {
        System.out.println("Sending Email Notification");
    }
}
