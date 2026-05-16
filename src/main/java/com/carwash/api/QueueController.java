package com.carwash.api;

import com.carwash.api.dto.CreateQueueEntryRequest;
import com.carwash.api.dto.UpdateQueuePositionRequest;
import com.carwash.domain.QueueEntry;
import com.carwash.service.QueueManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/queue-entries")
public class QueueController {

    private final QueueManagementService service;

    public QueueController(QueueManagementService service) {
        this.service = service;
    }

    @GetMapping
    public List<QueueEntry> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public QueueEntry getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public QueueEntry create(@RequestBody CreateQueueEntryRequest req) {
        return service.createQueueEntry(req.toQueueEntry());
    }

    @PutMapping("/{id}/position")
    public QueueEntry updatePosition(@PathVariable String id, @RequestBody UpdateQueuePositionRequest req) {
        return service.updatePosition(id, req.position());
    }

    @PostMapping("/{id}/call-next")
    public QueueEntry callNext(@PathVariable String id) {
        return service.callNext(id);
    }

    @PostMapping("/{id}/start")
    public QueueEntry start(@PathVariable String id) {
        return service.startService(id);
    }

    @PostMapping("/{id}/complete")
    public QueueEntry complete(@PathVariable String id) {
        return service.completeQueueEntry(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.deleteQueueEntry(id);
    }
}
