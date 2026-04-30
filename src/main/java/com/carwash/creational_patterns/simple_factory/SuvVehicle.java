package com.carwash.creational_patterns.simple_factory;

public class SuvVehicle implements FactoryVehicle {
    @Override
    public String getTypeName() {
        return "SUV";
    }

    @Override
    public int getRecommendedQueueSlotMinutes() {
        return 40;
    }
}
