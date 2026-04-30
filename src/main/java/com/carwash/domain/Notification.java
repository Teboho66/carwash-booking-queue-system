package com.carwash.domain;

import com.carwash.enums.DeliveryStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Notification {
    private String notificationId;
    private User user;
    private Booking booking;
    private String type;
    private String message;
    private String channel;
    private LocalDateTime sentAt;
    private LocalDateTime readAt;
    private DeliveryStatus deliveryStatus;

    public Notification() {
    }

    public Notification(String notificationId, User user, Booking booking, String type, String message, String channel) {
        this.notificationId = notificationId;
        this.user = user;
        this.booking = booking;
        this.type = type;
        this.message = message;
        this.channel = channel;
        this.deliveryStatus = DeliveryStatus.PENDING;
    }

    public void send() {
        this.sentAt = LocalDateTime.now();
        this.deliveryStatus = DeliveryStatus.SENT;
    }

    public void markAsRead() {
        this.readAt = LocalDateTime.now();
        this.deliveryStatus = DeliveryStatus.READ;
    }

    public void retryDelivery() {
        if (deliveryStatus == DeliveryStatus.FAILED || deliveryStatus == DeliveryStatus.PENDING) {
            send();
        }
    }

    public String formatMessage() {
        String bookingRef = booking != null ? booking.getBookingId() : "N/A";
        return "[" + type + "] Booking " + bookingRef + ": " + message;
    }

}
