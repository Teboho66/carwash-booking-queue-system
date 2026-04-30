package com.carwash.creational_patterns.abstract_factory;

public class CustomerDashboardPanel implements DashboardPanel {
    @Override
    public String render() {
        return "Customer Panel: Upcoming Booking and Queue Position";
    }
}
