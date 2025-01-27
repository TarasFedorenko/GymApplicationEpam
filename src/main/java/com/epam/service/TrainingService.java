package com.epam.service;

import com.epam.model.Training;

public interface TrainingService {

    void createTraining(Training training);
    Training getTraining(int id);

}
