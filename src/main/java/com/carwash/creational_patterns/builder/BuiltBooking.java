package com.carwash.creational_patterns.builder;

import java.time.LocalDateTime;

public class BuiltBooking {
    private final String customerName;
    private final String serviceName;
    private final String vehiclePlateNumber;
    private final LocalDateTime scheduledDateTime;
    private final String specialRequest;

    public BuiltBooking(String customerName, String serviceName, String vehiclePlateNumber, LocalDateTime scheduledDateTime, String specialRequest) {
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.vehiclePlateNumber = vehiclePlateNumber;
        this.scheduledDateTime = scheduledDateTime;
        this.specialRequest = specialRequest;
    }

    public String getCustomerName() { return customerName; }
    public String getServiceName() { return serviceName; }
    public String getVehiclePlateNumber() { return vehiclePlateNumber; }
    public LocalDateTime getScheduledDateTime() { return scheduledDateTime; }
    public String getSpecialRequest() { return specialRequest; }
}
