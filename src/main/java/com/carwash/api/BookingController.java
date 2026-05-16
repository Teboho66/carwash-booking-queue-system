package com.carwash.api;


import com.carwash.api.dto.CreateBookingRequest;
import com.carwash.domain.Booking;
import com.carwash.service.BookingManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {


    private final BookingManagementService service;

    public BookingController(BookingManagementService service) { this.service = service; }

    @GetMapping
    public List<Booking> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public Booking getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking create(@RequestBody CreateBookingRequest req) {
        return service.createBooking(req.toBooking());
    }

    @PutMapping("/{id}")
    public Booking update(@PathVariable String id, @RequestBody CreateBookingRequest req) {
        Booking b = req.toBooking(); b.setBookingId(id); return service.updateBooking(b);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) { service.cancelBooking(id); }

    @PostMapping("/{id}/confirm")
    public Booking confirm(@PathVariable String id) {
        return service.confirmBooking(id);
    }

    @PostMapping("/{id}/cancel")
    public Booking cancel(@PathVariable String id) {
        return service.cancelBooking(id);
    }
}
