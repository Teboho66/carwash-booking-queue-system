package com.carwash.creational_patterns.abstract_factory;

public class AdminActionButton implements ActionButton {
    @Override
    public String render() {
        return "Admin Button: Advance Queue";
    }
}
