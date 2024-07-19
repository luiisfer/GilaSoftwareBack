package com.gila.gilasoftware.persistence.repository;

import com.gila.gilasoftware.persistence.entity.NotificationEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface NotificationRepository extends ListCrudRepository<NotificationEntity, Integer> {
}
