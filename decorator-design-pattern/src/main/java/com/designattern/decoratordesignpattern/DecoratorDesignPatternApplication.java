package com.designattern.decoratordesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorDesignPatternApplication {

    public static void main(String[] args) {
        Notifier notifier = new TeamNotifier(new SlackNotifier(new BaseEmailNotifier()));
        notifier.sendNotification();
/*
Output:
Sending Email Notification
Sending Notification via Slack
Sending Notification via Teams
*/

        Notifier notifier1 = new SlackNotifier(new BaseEmailNotifier());
        notifier1.sendNotification();
/*
Output:
Sending Email Notification
Sending Notification via Slack
*/

        Notifier notifier3 = new TeamNotifier(new SlackNotifier(new TeamNotifier(new BaseEmailNotifier())));
        notifier3.sendNotification();
/*
Output:
Sending Email Notification
Sending Notification via Teams
Sending Notification via Slack
Sending Notification via Teams
*/


        SpringApplication.run(DecoratorDesignPatternApplication.class, args);
    }

}
