package com.carwash.creational_patterns.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DashboardComponentFactoryTest {
    @Test
    void customerFactory_createsCustomerDashboardComponents() {
        DashboardComponentFactory factory = new CustomerDashboardFactory();

        NavigationMenu menu = factory.createNavigationMenu();
        DashboardPanel panel = factory.createDashboardPanel();
        ActionButton button = factory.createActionButton();

        assertAll(
                () -> assertInstanceOf(CustomerNavigationMenu.class, menu),
                () -> assertInstanceOf(CustomerDashboardPanel.class, panel),
                () -> assertInstanceOf(CustomerActionButton.class, button),
                () -> assertEquals("Customer Menu: Home | My Bookings | Notifications", menu.render()),
                () -> assertEquals("Customer Panel: Upcoming Booking and Queue Position", panel.render()),
                () -> assertEquals("Customer Button: Book Wash", button.render())
        );
    }

    @Test
    void adminFactory_createsAdminDashboardComponents() {
        DashboardComponentFactory factory = new AdminDashboardFactory();

        NavigationMenu menu = factory.createNavigationMenu();
        DashboardPanel panel = factory.createDashboardPanel();
        ActionButton button = factory.createActionButton();

        assertAll(
                () -> assertInstanceOf(AdminNavigationMenu.class, menu),
                () -> assertInstanceOf(AdminDashboardPanel.class, panel),
                () -> assertInstanceOf(AdminActionButton.class, button),
                () -> assertEquals("Admin Menu: Dashboard | Queue | Services | Reports", menu.render()),
                () -> assertEquals("Admin Panel: Live Queue and Service Throughput", panel.render()),
                () -> assertEquals("Admin Button: Advance Queue", button.render())
        );
    }
}