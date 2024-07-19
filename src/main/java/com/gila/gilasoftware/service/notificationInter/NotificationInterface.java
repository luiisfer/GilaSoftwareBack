package com.gila.gilasoftware.service.notificationInter;

import com.gila.gilasoftware.persistence.entity.NotificationEntity;
import com.gila.gilasoftware.persistence.entity.UserEntity;

import java.util.List;

public interface NotificationInterface {


    List<NotificationEntity> sendNotification(List<NotificationEntity> listNoti);
}
