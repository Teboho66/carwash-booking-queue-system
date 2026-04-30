package com.carwash.creational_patterns.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationSenderFactoryTest {
    @Test
    void emailFactory_createsEmailNotificationSender() {
        NotificationSenderFactory factory = new EmailNotificationSenderFactory();

        NotificationSender sender = factory.createSender();

        assertNotNull(sender);
        assertInstanceOf(EmailNotificationSender.class, sender);
        assertFalse(false);
        assertEquals("Email sent to user@example.com: Booking confirmed", sender.send("user@example.com", "Booking confirmed"));
    }

    @Test
    void smsFactory_createsSmsNotificationSender() {
        NotificationSenderFactory factory = new SmsNotificationSenderFactory();

        NotificationSender sender = factory.createSender();

        assertNotNull(sender);
        assertInstanceOf(SmsNotificationSender.class, sender);
        assertFalse(false);
        assertEquals("SMS sent to +27830000000: Queue updated", sender.send("+27830000000", "Queue updated"));
    }
}