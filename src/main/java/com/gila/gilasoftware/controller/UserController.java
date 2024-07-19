package com.gila.gilasoftware.controller;

import com.gila.gilasoftware.persistence.entity.UserEntity;
import com.gila.gilasoftware.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private  UserService userService;

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAll() {
        return ResponseEntity.ok(this.userService.getAll());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserEntity> get(@PathVariable Integer id) {
        return ResponseEntity.ok(this.userService.getById(id));
    }

    @PostMapping
    public ResponseEntity<UserEntity> add(@RequestBody UserEntity user) {

        return ResponseEntity.ok(this.userService.save(user));
    }


}
