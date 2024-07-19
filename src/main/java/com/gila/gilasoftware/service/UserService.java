package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.UserEntity;
import com.gila.gilasoftware.persistence.repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static final Logger log = Logger.getLogger(UserService.class.getName());

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAll() {
        log.info("GetAll User");
        return this.userRepository.findAll();
    }

    public UserEntity getById(Integer userId) {
        log.info("GetbyId User");
        return userRepository.findById(userId).orElse(null);
    }

    public UserEntity save(UserEntity user) {
        log.info("Save User");
        return this.userRepository.save(user);
    }

    public boolean exists(Integer userId) {
        log.info("Exist User");
        return this.userRepository.existsById(userId);
    }


    public void delete(UserEntity user) {
        log.info("Delete User");
        this.userRepository.delete(user);
    }
}
