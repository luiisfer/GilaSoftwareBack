package com.gila.gilasoftware.persistence.repository;

import com.gila.gilasoftware.persistence.entity.UserCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCategoryRepository extends JpaRepository<UserCategoryEntity, Integer> {
}
