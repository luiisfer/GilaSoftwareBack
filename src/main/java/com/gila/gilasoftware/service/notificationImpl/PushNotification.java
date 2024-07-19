package com.gila.gilasoftware.service.notificationImpl;

import com.gila.gilasoftware.persistence.entity.NotificationEntity;
import com.gila.gilasoftware.service.notificationInter.NotificationInterface;

import java.util.List;

public class PushNotification implements NotificationInterface {


    @Override
    public List<NotificationEntity> sendNotification(List<NotificationEntity> listNoti) {
        System.out.println("Push Notification");
        listNoti.add(new NotificationEntity(3));
        return listNoti;
    }
}
