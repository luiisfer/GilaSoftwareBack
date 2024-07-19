package com.gila.gilasoftware.controller;

import com.gila.gilasoftware.persistence.entity.NotificationEntity;
import com.gila.gilasoftware.persistence.entity.UserEntity;
import com.gila.gilasoftware.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public ResponseEntity<List<NotificationEntity>> getAll() {
        return ResponseEntity.ok(this.notificationService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotificationEntity> get(@PathVariable Integer id) {
        return ResponseEntity.ok(this.notificationService.get(id));
    }

    @PostMapping
    public ResponseEntity<NotificationEntity> add(@RequestBody NotificationEntity notification) {
        return ResponseEntity.ok(this.notificationService.save(notification));
    }
}
