package com.carwash.api.dto;

import com.carwash.domain.Vehicle;

public record CreateVehicleRequest(String userId, String vehicleId, String plateNumber, String vehicleType, String brand, String model, String color, String notes) {

    public Vehicle toVehicle() { return new Vehicle(vehicleId, plateNumber, vehicleType, brand, model, color, notes); }

}
