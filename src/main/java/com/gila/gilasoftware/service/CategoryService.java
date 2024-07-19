package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.CategoryEntity;
import com.gila.gilasoftware.persistence.repository.CategoryRepository;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private static final Logger log = Logger.getLogger(CategoryService.class.getName());

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryEntity getById(Integer categoryId) {
        log.info("getById Category");
        return categoryRepository.findById(categoryId).orElse(null);
    }

    public List<CategoryEntity> getAll() {

        log.info("GetAll Category");
        return this.categoryRepository.findAll();
    }

    public CategoryEntity save(CategoryEntity notification) {
        log.info("Save Category");
        return this.categoryRepository.save(notification);
    }

    public List<CategoryEntity> saveAll(List<CategoryEntity> notification) {
        log.info("SaveAll Category");
        return this.categoryRepository.saveAll(notification);
    }

    public void delete(CategoryEntity category) {
        log.info("Delete Category");
        this.categoryRepository.delete(category);
    }

    public boolean exists(Integer categoryId) {
        log.info("Exist Category");
        return this.categoryRepository.existsById(categoryId);
    }

}
