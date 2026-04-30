package com.carwash.creational_patterns.factory_method;

public class EmailNotificationSenderFactory extends NotificationSenderFactory {
    @Override
    public NotificationSender createSender() {
        return new EmailNotificationSender();
    }
}
