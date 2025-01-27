package com.epam.service.impl;

import com.epam.dao.TrainingDAO;
import com.epam.model.Training;
import com.epam.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private TrainingDAO trainingDAO;

    @Override
    public void createTraining(Training training) {

    }

    @Override
    public Training getTraining(int id) {
        return null;
    }
}
