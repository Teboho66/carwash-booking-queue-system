package com.carwash.creational_patterns.simple_factory;

public class TruckVehicle implements FactoryVehicle {
    @Override
    public String getTypeName() {
        return "Truck";
    }

    @Override
    public int getRecommendedQueueSlotMinutes() {
        return 50;
    }
}
