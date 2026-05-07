package com.example.ReactSpringApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SignUp {
    @Id
    @GeneratedValue
    long id;
    String name;
    String email;
    String password;

}

