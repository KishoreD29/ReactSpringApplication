package com.example.ReactSpringApp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;


}
