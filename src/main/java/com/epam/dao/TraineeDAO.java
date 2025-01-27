package com.epam.dao;

import com.epam.model.Trainee;

import java.util.Optional;

public interface TraineeDAO {
    void createTrainee(Trainee trainee);
    void updateTrainee(Trainee trainee);
    void deleteTrainee(Trainee trainee);
    Optional<Trainee> getTrainee(long id);
}
