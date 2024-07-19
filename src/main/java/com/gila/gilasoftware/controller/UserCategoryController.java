package com.gila.gilasoftware.controller;

import com.gila.gilasoftware.persistence.entity.CategoryEntity;
import com.gila.gilasoftware.persistence.entity.UserCategoryEntity;
import com.gila.gilasoftware.persistence.entity.UserEntity;
import com.gila.gilasoftware.service.CategoryService;
import com.gila.gilasoftware.service.UserCategoryService;
import com.gila.gilasoftware.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/message")
public class UserCategoryController {

    @Autowired
    private UserCategoryService userCategoryService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserCategoryEntity>> getAll() {
        return ResponseEntity.ok(this.userCategoryService.getAll());
    }

    @PostMapping("/user/category/{categoryId}")
    public ResponseEntity<UserCategoryEntity> add(@PathVariable(value = "categoryId") Integer categoryId,
                                                  @RequestBody UserCategoryEntity userCategory) {
        CategoryEntity category=categoryService.getById(categoryId);
        userCategory.setCategoryUsEntity(category);

        UserEntity user = userService.getById(1);
        userCategory.setUserCatEntity(user);
        return ResponseEntity.ok(this.userCategoryService.save(userCategory));
    }
}
