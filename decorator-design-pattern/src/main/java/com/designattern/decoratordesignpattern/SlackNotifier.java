package com.designattern.decoratordesignpattern;

public class SlackNotifier extends NotifierDecorator {
    public Notifier notifier;
    public SlackNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
    @Override
    public void sendNotification() {
        notifier.sendNotification();
        System.out.println("Sending Notification via Slack");
    }
}
