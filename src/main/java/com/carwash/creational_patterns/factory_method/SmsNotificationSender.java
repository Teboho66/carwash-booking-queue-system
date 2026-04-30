package com.carwash.creational_patterns.factory_method;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public String send(String recipient, String message) {
        return "SMS sent to " + recipient + ": " + message;
    }
}
