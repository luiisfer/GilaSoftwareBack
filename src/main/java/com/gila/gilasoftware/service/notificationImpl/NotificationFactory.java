package com.gila.gilasoftware.service.notificationImpl;

import com.gila.gilasoftware.service.notificationInter.NotificationInterface;

public class NotificationFactory {

    public enum NotificationType {SMS, Email , Push}

    public static NotificationInterface getNotification(NotificationType notificationType)  {
        switch (notificationType){
            case SMS -> {
                return new SMSNotification();
            }
            case Email -> {
                return new EmailNotification();
            }
            case Push -> {
                return new PushNotification();
            }
            default -> {
                throw new IllegalArgumentException("Don't Supported");
            }

        }
    }
}
