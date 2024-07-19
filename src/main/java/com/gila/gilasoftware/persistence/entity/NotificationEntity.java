package com.gila.gilasoftware.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Notification")
@Getter
@Setter
@NoArgsConstructor
public class NotificationEntity {

    public NotificationEntity(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public NotificationEntity(Integer notificationId, String name) {
        this.notificationId = notificationId;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notification", nullable = false)
    private Integer notificationId;

    @Column( nullable = false, length = 150)
    private String name;


    @JsonIgnore
    @ManyToMany(mappedBy = "notificationUser" , fetch = FetchType.LAZY)
    List<UserEntity> userEntities;



}
