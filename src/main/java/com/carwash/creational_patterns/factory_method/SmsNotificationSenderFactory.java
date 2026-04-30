package com.carwash.creational_patterns.factory_method;

public class SmsNotificationSenderFactory extends NotificationSenderFactory {
    @Override
    public NotificationSender createSender() {
        return new SmsNotificationSender();
    }
}
