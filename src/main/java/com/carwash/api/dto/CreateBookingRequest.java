package com.carwash.api.dto;

import com.carwash.domain.Booking;
import com.carwash.domain.Service;
import com.carwash.domain.User;
import com.carwash.domain.Vehicle;

import java.time.LocalDateTime;

public record CreateBookingRequest(String bookingId, String userId, String vehicleId, String serviceId, LocalDateTime scheduledDateTime, String specialRequest) {

    public Booking toBooking() {
        User user = new User(); user.setUserId(userId);
        Vehicle vehicle = new Vehicle(); vehicle.setVehicleId(vehicleId);
        Service service = new Service(); service.setServiceId(serviceId);
        return new Booking(bookingId, user, vehicle, service, scheduledDateTime, specialRequest);
    }
}
