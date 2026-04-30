package com.carwash.creational_patterns.abstract_factory;

public class AdminDashboardFactory implements DashboardComponentFactory {
    @Override
    public NavigationMenu createNavigationMenu() {
        return new AdminNavigationMenu();
    }

    @Override
    public DashboardPanel createDashboardPanel() {
        return new AdminDashboardPanel();
    }

    @Override
    public ActionButton createActionButton() {
        return new AdminActionButton();
    }
}
