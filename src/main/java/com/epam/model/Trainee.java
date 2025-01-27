package com.epam.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class Trainee {

    private long id;
    private LocalDate dateOfBirth;
    private String address;
    private long userId;
}

