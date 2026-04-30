package com.carwash.creational_patterns.builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingBuilderTest {
    @Test
    void build_withRequiredFields_returnsBooking() {
        LocalDateTime scheduledAt = LocalDateTime.of(2026, 5, 1, 10, 30);

        BuiltBooking booking = new BookingBuilder()
                .customerName("Alex")
                .serviceName("Premium Wash")
                .vehiclePlateNumber("CAW123GP")
                .scheduledDateTime(scheduledAt)
                .build();

        assertAll(
                () -> assertEquals("Alex", booking.getCustomerName()),
                () -> assertEquals("Premium Wash", booking.getServiceName()),
                () -> assertEquals("CAW123GP", booking.getVehiclePlateNumber()),
                () -> assertEquals(scheduledAt, booking.getScheduledDateTime()),
                () -> assertNull(booking.getSpecialRequest())
        );
    }

    @Test
    void build_withOptionalSpecialRequest_appliesValue() {
        BuiltBooking booking = new BookingBuilder()
                .customerName("Sam")
                .serviceName("Basic Wash")
                .vehiclePlateNumber("ND12345")
                .scheduledDateTime(LocalDateTime.of(2026, 5, 2, 12, 0))
                .specialRequest("Use non-scented products")
                .build();

        assertEquals("Use non-scented products", booking.getSpecialRequest());
    }

    @Test
    void build_missingService_throwsException() {
        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> new BookingBuilder()
                        .customerName("Sam")
                        .vehiclePlateNumber("ND12345")
                        .scheduledDateTime(LocalDateTime.now())
                        .build()
        );

        assertEquals("Service name is required", exception.getMessage());
    }
}