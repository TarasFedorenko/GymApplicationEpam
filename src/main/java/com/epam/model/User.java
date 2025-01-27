package com.epam.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private boolean isActive;
}
