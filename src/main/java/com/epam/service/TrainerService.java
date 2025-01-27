package com.epam.service;

import com.epam.model.Trainer;

public interface TrainerService {
    void createTrainer(Trainer trainer);
    void updateTrainer(Trainer trainer);
    Trainer getTrainer(String trainerId);
}
