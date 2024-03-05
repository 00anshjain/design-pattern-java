package com.designattern.decoratordesignpattern;

public class TeamNotifier extends NotifierDecorator {
    public Notifier notifier;
    public TeamNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
    @Override
    public void sendNotification() {
        notifier.sendNotification();
        System.out.println("Sending Notification via Teams");
    }
}
