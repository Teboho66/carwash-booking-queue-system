package com.carwash.creational_patterns.abstract_factory;

public class AdminDashboardPanel implements DashboardPanel {
    @Override
    public String render() {
        return "Admin Panel: Live Queue and Service Throughput";
    }
}
