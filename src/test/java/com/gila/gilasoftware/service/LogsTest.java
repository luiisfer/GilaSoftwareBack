package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.LogsEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class LogsTest {

    @Autowired
    private LogsService logsService;

    @Test
    @DisplayName("Log Test")
    void checkIfLogExist(){

        LogsEntity logs = new LogsEntity();
        logs.setDated("10/07/2024");
        logs.setLevel("Level1");
        logs.setLogger("INFO");
        logs.setMessage("Message1");

        logsService.save(logs);

        boolean expected = logsService.exists(logs.getLogsId());
        logsService.delete(logs);

        assertThat(expected).isTrue();

    }

}