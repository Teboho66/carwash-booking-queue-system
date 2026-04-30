package com.carwash.creational_patterns.abstract_factory;

public class AdminNavigationMenu implements NavigationMenu {
    @Override
    public String render() {
        return "Admin Menu: Dashboard | Queue | Services | Reports";
    }
}
