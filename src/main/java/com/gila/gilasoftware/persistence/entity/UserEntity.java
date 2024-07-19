package com.gila.gilasoftware.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity   {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    @Column(name = "name", nullable = false, length = 15)
    private String name;

    @Column(name = "email", nullable = false, length = 15)
    private String email;

    @Column(name = "phoneNumber", nullable = false, length = 15)
    private String phoneNumber;


    @ManyToMany
    @JoinTable(
            name = "user_notification",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_notification"))
    List<NotificationEntity> notificationUser;

    @JsonIgnore
    @OneToMany(mappedBy = "userCatEntity")
    List<UserCategoryEntity> userCategoryEntities;


    @Override
    public String toString() {
        return "UserEntity{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
