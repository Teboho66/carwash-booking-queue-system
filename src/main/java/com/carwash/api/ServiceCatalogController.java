package com.carwash.api;

import com.carwash.domain.Service;
import com.carwash.service.ServiceCatalogService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceCatalogController {

    private final ServiceCatalogService service;

    public ServiceCatalogController(ServiceCatalogService service) { this.service = service; }
    @GetMapping
    public List<Service> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Service getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Service create(@RequestBody Service s) {
        return service.createService(s);
    }

    @PutMapping("/{id}")
    public Service update(@PathVariable String id, @RequestBody Service s) {
        s.setServiceId(id); return service.updateService(s);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.deleteService(id);
    }

    @PostMapping("/{id}/activate")
    public Service activate(@PathVariable String id) {
        return service.activateService(id);
    }

    @PostMapping("/{id}/deactivate")
    public Service deactivate(@PathVariable String id) {
        return service.deactivateService(id);
    }
}
