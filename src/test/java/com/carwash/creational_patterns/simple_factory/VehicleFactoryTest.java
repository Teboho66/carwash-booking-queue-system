package com.carwash.creational_patterns.simple_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {
    @Test
    void createVehicle_withSedanType_returnsSedanVehicle() {
        FactoryVehicle vehicle = VehicleFactory.createVehicle(VehicleType.SEDAN);

        assertNotNull(vehicle);
        assertInstanceOf(SedanVehicle.class, vehicle);
        assertEquals("Sedan", vehicle.getTypeName());
        assertEquals(30, vehicle.getRecommendedQueueSlotMinutes());
    }

    @Test
    void createVehicle_withSuvType_returnsSuvVehicle() {
        FactoryVehicle vehicle = VehicleFactory.createVehicle(VehicleType.SUV);

        assertNotNull(vehicle);
        assertInstanceOf(SuvVehicle.class, vehicle);
        assertEquals("SUV", vehicle.getTypeName());
        assertEquals(40, vehicle.getRecommendedQueueSlotMinutes());
    }

    @Test
    void createVehicle_withTruckType_returnsTruckVehicle() {
        FactoryVehicle vehicle = VehicleFactory.createVehicle(VehicleType.TRUCK);

        assertNotNull(vehicle);
        assertInstanceOf(TruckVehicle.class, vehicle);
        assertEquals("Truck", vehicle.getTypeName());
        assertEquals(50, vehicle.getRecommendedQueueSlotMinutes());
    }

    @Test
    void createVehicle_withNullType_throwsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> VehicleFactory.createVehicle(null)
        );

        assertEquals("Vehicle type must not be null", exception.getMessage());
    }
}