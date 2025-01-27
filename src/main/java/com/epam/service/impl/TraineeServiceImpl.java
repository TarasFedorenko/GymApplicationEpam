package com.epam.service.impl;

import com.epam.dao.TraineeDAO;
import com.epam.model.Trainee;
import com.epam.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TraineeServiceImpl implements TraineeService {

    @Autowired
    private TraineeDAO traineeDAO;

    @Override
    public void createTrainee(Trainee trainee) {

    }

    @Override
    public void updateTrainee(Trainee trainee) {

    }

    @Override
    public void deleteTrainee(Trainee trainee) {

    }

    @Override
    public Trainee getTrainee(long id) {
        return null;
    }
}
