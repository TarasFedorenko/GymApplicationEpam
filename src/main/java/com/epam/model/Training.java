package com.epam.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Training {
    private long id;
    private long trainerId;
    private long traineeId;
    private String trainingName;
    private long trainingTypeId;
    private LocalDate trainingDate;
    private int duration;

}
