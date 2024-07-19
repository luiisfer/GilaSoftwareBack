package com.gila.gilasoftware.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Logs")
@Getter
@Setter
public class LogsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_logs", nullable = false)
    private Integer logsId;

    @Column( nullable = false, length = 150)
    private String dated;

    @Column( nullable = false, length = 150)
    private String logger;

    @Column( nullable = false, length = 150)
    private String level;

    @Column( nullable = false, length = 1000)
    private String message;
}
