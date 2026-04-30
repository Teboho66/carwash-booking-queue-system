package com.carwash.creational_patterns.builder;

import java.time.LocalDateTime;

public class BookingBuilder {
    private String customerName;
    private String serviceName;
    private String vehiclePlateNumber;
    private LocalDateTime scheduledDateTime;
    private String specialRequest;

    public BookingBuilder customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public BookingBuilder serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public BookingBuilder vehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
        return this;
    }

    public BookingBuilder scheduledDateTime(LocalDateTime scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
        return this;
    }

    public BookingBuilder specialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
        return this;
    }

    public BuiltBooking build() {
        if (isBlank(customerName)) {
            throw new IllegalStateException("Customer name is required");
        }
        if (isBlank(serviceName)) {
            throw new IllegalStateException("Service name is required");
        }
        if (isBlank(vehiclePlateNumber)) {
            throw new IllegalStateException("Vehicle plate number is required");
        }
        if (scheduledDateTime == null) {
            throw new IllegalStateException("Scheduled date/time is required");
        }

        return new BuiltBooking(customerName, serviceName, vehiclePlateNumber, scheduledDateTime, specialRequest);
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
