package com.carwash.creational_patterns.simple_factory;

public final class VehicleFactory {
    private VehicleFactory() {
    }

    public static FactoryVehicle createVehicle(VehicleType type) {
        if (type == null) {
            throw new IllegalArgumentException("Vehicle type must not be null");
        }

        return switch (type) {
            case SEDAN -> new SedanVehicle();
            case SUV -> new SuvVehicle();
            case TRUCK -> new TruckVehicle();
        };
    }
}
