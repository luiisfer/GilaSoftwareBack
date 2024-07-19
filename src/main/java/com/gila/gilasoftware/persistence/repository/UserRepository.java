package com.gila.gilasoftware.persistence.repository;


import com.gila.gilasoftware.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {


}
