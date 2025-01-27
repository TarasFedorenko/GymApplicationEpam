package com.epam.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Trainer {

    private long id;
    private TrainingType specialization;
    private long userId;
}
