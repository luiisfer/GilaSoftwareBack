package com.gila.gilasoftware.controller;

import com.gila.gilasoftware.persistence.entity.CategoryEntity;
import com.gila.gilasoftware.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/category")
public class CategoryController {





    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryEntity>> getAll() {
        return ResponseEntity.ok(this.categoryService.getAll());
    }

    @PostMapping
    public ResponseEntity<CategoryEntity> save(@RequestBody CategoryEntity category) {
        return ResponseEntity.ok(this.categoryService.save(category));
    }
}
