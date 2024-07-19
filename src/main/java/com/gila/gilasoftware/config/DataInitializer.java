package com.gila.gilasoftware.config;

import com.gila.gilasoftware.persistence.entity.CategoryEntity;
import com.gila.gilasoftware.persistence.entity.NotificationEntity;
import com.gila.gilasoftware.persistence.entity.UserEntity;
import com.gila.gilasoftware.service.CategoryService;
import com.gila.gilasoftware.service.NotificationService;
import com.gila.gilasoftware.service.UserService;
import com.gila.gilasoftware.service.notificationImpl.NotificationFactory;
import com.gila.gilasoftware.service.notificationInter.NotificationInterface;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataInitializer {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private CategoryService categoryService;



/*    @PostConstruct
    public void initNotification() {
        List<NotificationEntity> listNotification = new ArrayList<>();
        listNotification.add(new NotificationEntity(1,"SMS" ));
        listNotification.add(new NotificationEntity(2, "E-Mail" ));
        listNotification.add(new NotificationEntity(3, "Push Notification" ));


        notificationService.saveAll(listNotification);

    }*/

    @PostConstruct
    public void initCategory() {

        List<CategoryEntity> listCategory = new ArrayList<>();
        listCategory.add(new CategoryEntity(1,"Sport" ));
        listCategory.add(new CategoryEntity(2,"Finance" ));
        listCategory.add(new CategoryEntity(3,"Movie" ));

        categoryService.saveAll(listCategory);

    }

    @PostConstruct
    public void init() {
        List<NotificationEntity> listNotification = new ArrayList<>();
        listNotification.add(new NotificationEntity(1,"SMS" ));
        listNotification.add(new NotificationEntity(2, "E-Mail" ));
        listNotification.add(new NotificationEntity(3, "Push Notification" ));


        notificationService.saveAll(listNotification);


        List<CategoryEntity> listCategory = new ArrayList<>();
        listCategory.add(new CategoryEntity(1,"Sport" ));
        listCategory.add(new CategoryEntity(2,"Finance" ));
        listCategory.add(new CategoryEntity(3,"Movie" ));

        categoryService.saveAll(listCategory);

        UserEntity user = userTest();
        userService.save(user);

//        if (!this.userService.exists(1)) {
//            UserEntity user = userTest();
//            userService.save(user);
//        }
//        System.out.println("Ya existe el id");



    }

    public UserEntity userTest (){
        UserEntity user = new UserEntity();
        user.setName("Administrador");
        user.setEmail("admin@email.com");
        user.setPhoneNumber("888888");
        List<NotificationEntity> listNoti = new ArrayList<>();

        NotificationInterface PushNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.Push);
        user.setNotificationUser(PushNotification.sendNotification(listNoti));


        NotificationInterface SMSNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.SMS);
        user.setNotificationUser(SMSNotification.sendNotification(listNoti));

        NotificationInterface EmailNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.Email);
        user.setNotificationUser(EmailNotification.sendNotification(listNoti));




        List<CategoryEntity> listCat = new ArrayList<>();
        listCat.add(new CategoryEntity(1));
        //user.setCategoriesUser(listCat);

        return user;
    }


}
