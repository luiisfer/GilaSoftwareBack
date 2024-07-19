package com.gila.gilasoftware.persistence.repository;

import com.gila.gilasoftware.persistence.entity.LogsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogsRepository extends JpaRepository<LogsEntity, Integer> {

    public List<LogsEntity> findAll();


}
