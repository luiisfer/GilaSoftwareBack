package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.NotificationEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class NotificationInterfaceTest {

    @Autowired
    private  NotificationService notificationService;

    @Test
    @DisplayName("Notification Test")
    void checkIfNotificationExist(){

        NotificationEntity notification = new NotificationEntity();
        notification.setName("Notification1");

        notificationService.save(notification);

        boolean expected = notificationService.exists(notification.getNotificationId());
        notificationService.delete(notification);

        assertThat(expected).isTrue();
    }

}