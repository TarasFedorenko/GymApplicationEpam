package com.epam.service;

import com.epam.model.Trainee;

public interface TraineeService {
    void createTrainee(Trainee trainee);
    void updateTrainee(Trainee trainee);
    void deleteTrainee(Trainee trainee);
    Trainee getTrainee(long id);
}
