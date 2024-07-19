package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.UserCategoryEntity;
import com.gila.gilasoftware.persistence.repository.UserCategoryRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCategoryService {

    private static final Logger log = Logger.getLogger(UserCategoryService.class.getName());

    @Autowired
    private UserCategoryRepository userCategoryRepository;

    public List<UserCategoryEntity> getAll() {
        log.info("GetAll UserCategory");
        return this.userCategoryRepository.findAll();
    }

    public UserCategoryEntity save(UserCategoryEntity user) {
        log.info("Saved Message");
        return this.userCategoryRepository.save(user);
    }

    public UserCategoryEntity getById(Integer user) {
        log.info("Get UserCategory");
        return userCategoryRepository.findById(user).orElse(null);
    }


    public void delete(UserCategoryEntity user) {
        log.info("Delete UserCategory");
        this.userCategoryRepository.delete(user);
    }

    public boolean exists(Integer user) {
        log.info("Exist UserCategory");
        return this.userCategoryRepository.existsById(user);
    }


}
