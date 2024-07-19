package com.gila.gilasoftware.persistence.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Category")
@Getter
@Setter
@NoArgsConstructor
public class CategoryEntity {

    public CategoryEntity(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryEntity(Integer categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category", nullable = false)
    private Integer categoryId;

    @Column( nullable = false, length = 150)
    private String name;


    @JsonIgnore
    @OneToMany(mappedBy = "categoryUsEntity")
    List<UserCategoryEntity> userCategoryEntities;




}
