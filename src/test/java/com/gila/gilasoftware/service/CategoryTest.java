package com.gila.gilasoftware.service;


import com.gila.gilasoftware.persistence.entity.CategoryEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CategoryTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    @DisplayName("GetById Category Test")
    void checkIfCategoryExist(){

        CategoryEntity category = new CategoryEntity();
        category.setName("Category1");

        categoryService.save(category);

        boolean expected = categoryService.exists(category.getCategoryId());
        categoryService.delete(category);
        assertThat(expected).isTrue();
    }

}