package com.carwash.creational_patterns.factory_method;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public String send(String recipient, String message) {
        return "Email sent to " + recipient + ": " + message;
    }
}
