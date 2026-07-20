package com.example.ReactSpringApp.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue
    long doctor_id;

    boolean available;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
