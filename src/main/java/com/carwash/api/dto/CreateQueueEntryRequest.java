package com.carwash.api.dto;

import com.carwash.domain.Booking;
import com.carwash.domain.QueueEntry;
import com.carwash.domain.Service;

public record CreateQueueEntryRequest(String queueEntryId, String bookingId, String serviceId, int position) {

    public QueueEntry toQueueEntry() {
        Booking booking = new Booking(); booking.setBookingId(bookingId);
        Service service = new Service(); service.setServiceId(serviceId);
        return new QueueEntry(queueEntryId, booking, service, position);
    }
}