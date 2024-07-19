package com.gila.gilasoftware.controller;

import com.gila.gilasoftware.persistence.entity.LogsEntity;
import com.gila.gilasoftware.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/logs")
public class LogsController {

    @Autowired
    private LogsService logsService;


    @GetMapping
    public ResponseEntity<List<LogsEntity>> orderByDate() {
        return ResponseEntity.ok(this.logsService.orderByDate());
    }
}
