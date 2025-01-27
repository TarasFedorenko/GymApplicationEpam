package com.epam.dao;

import com.epam.model.Training;

import java.util.Optional;

public interface TrainingDAO {
    void createTraining(Training training);
    Optional<Training> getTraining(int id);
}
