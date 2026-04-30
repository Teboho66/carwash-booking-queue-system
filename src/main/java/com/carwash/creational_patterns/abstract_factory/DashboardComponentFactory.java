package com.carwash.creational_patterns.abstract_factory;

public interface DashboardComponentFactory {
    NavigationMenu createNavigationMenu();
    DashboardPanel createDashboardPanel();
    ActionButton createActionButton();
}
