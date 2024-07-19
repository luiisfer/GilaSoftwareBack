package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserTest {

    @Autowired
    private  UserService userService;



    @Test
    @DisplayName("User Test")
    void checkIfUserExist(){

        UserEntity user = new UserEntity();
        user.setName("User1");
        user.setEmail("user1@email.com");
        user.setPhoneNumber("123");

        userService.save(user);


        boolean expected = userService.exists(user.getIdUser());
        userService.delete(user);


        assertThat(expected).isTrue();

    }


}