package com.carwash.creational_patterns.abstract_factory;

public class CustomerNavigationMenu implements NavigationMenu {
    @Override
    public String render() {
        return "Customer Menu: Home | My Bookings | Notifications";
    }
}
