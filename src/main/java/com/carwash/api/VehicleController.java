package com.carwash.api;

import com.carwash.api.dto.CreateVehicleRequest;
import com.carwash.domain.Vehicle;
import com.carwash.service.VehicleManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleManagementService service;

    public VehicleController(VehicleManagementService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vehicle> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Vehicle getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vehicle create(@RequestBody CreateVehicleRequest req) {
        return service.createVehicle(req.toVehicle(), req.userId());
    }

    @PutMapping("/{id}")
    public Vehicle update(@PathVariable String id, @RequestBody Vehicle vehicle) {
        vehicle.setVehicleId(id);
        return service.updateVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.deleteVehicle(id);
    }
}
