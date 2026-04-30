package com.carwash.creational_patterns.simple_factory;

public class SedanVehicle implements FactoryVehicle {
    @Override
    public String getTypeName() {
        return "Sedan";
    }

    @Override
    public int getRecommendedQueueSlotMinutes() {
        return 30;
    }
}
