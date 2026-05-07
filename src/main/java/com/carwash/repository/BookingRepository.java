package com.carwash.repository;

import com.carwash.domain.Booking;

import java.util.List;

public interface BookingRepository extends Repository<Booking, String> {
    List<Booking> findByUserId(String userId);
}
