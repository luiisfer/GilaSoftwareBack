package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.CategoryEntity;
import com.gila.gilasoftware.persistence.entity.UserCategoryEntity;
import com.gila.gilasoftware.persistence.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserCategoryTest {

    @Autowired
    private UserCategoryService userCategoryService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    @Test
    @DisplayName("UserCategory Test")
    void checkIfUserCategoryExist(){

        UserCategoryEntity userCategory = new UserCategoryEntity();
        userCategory.setMessage("Test");
        CategoryEntity category=categoryService.getById(1);
        userCategory.setCategoryUsEntity(category);

        UserEntity user = userService.getById(1);
        userCategory.setUserCatEntity(user);

        userCategoryService.save(userCategory);

        boolean expected = userCategoryService.exists(userCategory.getIdUC());
        userCategoryService.delete(userCategory);

        assertThat(expected).isTrue();

    }

}