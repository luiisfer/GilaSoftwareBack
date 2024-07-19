package com.gila.gilasoftware.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_UC", nullable = false)
    private Integer idUC;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_category")
    CategoryEntity categoryUsEntity;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    UserEntity userCatEntity;

    @Column(name = "message", nullable = false, length = 150)
    private String message;

    @Override
    public String toString() {
        return "UserCategoryEntity{" +
                "idUC=" + idUC +
                ", categoryUsEntity=" + categoryUsEntity +
                ", userCatEntity=" + userCatEntity +
                ", message='" + message + '\'' +
                '}';
    }

    public void setUserCatEntity(UserEntity userCatEntity) {
        this.userCatEntity = userCatEntity;
    }
}
