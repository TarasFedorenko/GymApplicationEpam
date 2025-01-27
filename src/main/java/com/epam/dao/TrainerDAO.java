package com.epam.dao;

import com.epam.model.Trainer;

import java.util.Optional;

public interface TrainerDAO {
    void createTrainer(Trainer trainer);
    void updateTrainer(Trainer trainer);
    Optional<Trainer> getTrainer(String trainerId);
}
