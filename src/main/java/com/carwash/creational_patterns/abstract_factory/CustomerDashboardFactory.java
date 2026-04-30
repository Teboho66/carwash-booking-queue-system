package com.carwash.creational_patterns.abstract_factory;

public class CustomerDashboardFactory implements DashboardComponentFactory {
    @Override
    public NavigationMenu createNavigationMenu() {
        return new CustomerNavigationMenu();
    }

    @Override
    public DashboardPanel createDashboardPanel() {
        return new CustomerDashboardPanel();
    }

    @Override
    public ActionButton createActionButton() {
        return new CustomerActionButton();
    }
}
