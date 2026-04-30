package com.carwash.creational_patterns.abstract_factory;

public class CustomerActionButton implements ActionButton {
    @Override
    public String render() {
        return "Customer Button: Book Wash";
    }
}
