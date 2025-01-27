package com.epam.config;

import com.epam.model.Trainee;
import com.epam.model.Trainer;
import com.epam.model.Training;
import com.epam.util.DataUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class StorageConfig {
    @Value("${storage.filepath.trainee}")
    private String traineeFilePath;
    @Value("${storage.filepath.trainer}")
    private String trainerFilePath;
    @Value("${storage.filepath.training}")
    private String trainingFilePath;


    @Bean
    public Map<Long, Trainee> traineeStorage(){
        Map<Long, Trainee> traineeMap = new HashMap<>();
        DataUtil.loadDataFromFile(traineeMap, traineeFilePath, Trainee.class);
        return traineeMap;
    }

    @Bean
    public Map<Long, Trainer> trainerStorage(){
        Map<Long, Trainer> trainerMap = new HashMap<>();
        DataUtil.loadDataFromFile(trainerMap, trainerFilePath, Trainer.class);
        return trainerMap;
    }

    @Bean
    public Map<Long, Training> trainingStorage(){
        Map<Long, Training> trainingMap = new HashMap<>();
        DataUtil.loadDataFromFile(trainingMap, trainingFilePath, Training.class);
        return trainingMap;
    }
}
