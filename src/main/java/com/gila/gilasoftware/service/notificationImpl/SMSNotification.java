package com.gila.gilasoftware.service.notificationImpl;

import com.gila.gilasoftware.persistence.entity.NotificationEntity;
import com.gila.gilasoftware.service.notificationInter.NotificationInterface;

import java.util.List;

public class SMSNotification implements NotificationInterface {


    @Override
    public List<NotificationEntity> sendNotification(List<NotificationEntity> listNoti) {
        listNoti.add(new NotificationEntity(1));
        System.out.println("SMS Notification");
        return listNoti;
    }
}
