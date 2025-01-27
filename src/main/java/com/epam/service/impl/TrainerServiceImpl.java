package com.epam.service.impl;

import com.epam.dao.TrainerDAO;
import com.epam.model.Trainer;
import com.epam.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TrainerServiceImpl implements TrainerService {
    @Autowired
    private TrainerDAO trainerDAO;

    @Override
    public void createTrainer(Trainer trainer) {

    }

    @Override
    public void updateTrainer(Trainer trainer) {

    }

    @Override
    public Trainer getTrainer(String trainerId) {
        return null;
    }
}
