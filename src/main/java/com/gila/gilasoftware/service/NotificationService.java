package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.NotificationEntity;
import com.gila.gilasoftware.persistence.repository.NotificationRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    private static final Logger log = Logger.getLogger(NotificationService.class.getName());

    @Autowired
    private NotificationRepository notificationRepository;

    public List<NotificationEntity> getAll() {
        log.info("getAll Notification");
        return this.notificationRepository.findAll();
    }

    public NotificationEntity save(NotificationEntity notification) {
        log.info("Save Notification");
        return this.notificationRepository.save(notification);
    }

    public List<NotificationEntity> saveAll(List<NotificationEntity> notification) {
        log.info("SaveAll Notification");
        return this.notificationRepository.saveAll(notification);
    }

    public NotificationEntity get(Integer notification) {
        log.info("Get Notification");
        return notificationRepository.findById(notification).orElse(null);
    }

    public void delete(NotificationEntity notification) {
        log.info("Delete Notification");
        this.notificationRepository.delete(notification);
    }

    public boolean exists(Integer notification) {
        log.info("Exist Notification");
        return this.notificationRepository.existsById(notification);
    }


}
