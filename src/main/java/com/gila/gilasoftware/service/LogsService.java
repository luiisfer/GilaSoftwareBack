package com.gila.gilasoftware.service;

import com.gila.gilasoftware.persistence.entity.LogsEntity;
import com.gila.gilasoftware.persistence.repository.LogsRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsService {

    private static final Logger log = Logger.getLogger(LogsService.class.getName());

    @Autowired
    private LogsRepository logsRepository;

    public List<LogsEntity> orderByDate() {
        return this.logsRepository.findAll(Sort.by(Sort.Direction.DESC, "dated"));
    }



    public LogsEntity get(Integer logs) {
        log.info("Get Logs");
        return logsRepository.findById(logs).orElse(null);
    }

    public LogsEntity save(LogsEntity logs) {
        log.info("Save Logs");
        return this.logsRepository.save(logs);
    }

    public void delete(LogsEntity logs) {
        log.info("Delete Logs");
        this.logsRepository.delete(logs);
    }

    public boolean exists(Integer logs) {
        log.info("Exist Logs");
        return this.logsRepository.existsById(logs);
    }
}
