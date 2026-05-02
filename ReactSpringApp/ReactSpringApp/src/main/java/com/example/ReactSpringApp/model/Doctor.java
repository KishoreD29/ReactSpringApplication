package com.example.ReactSpringApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class Doctor {
    @Id
    @GeneratedValue
    long doctor_id;

    boolean available;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
