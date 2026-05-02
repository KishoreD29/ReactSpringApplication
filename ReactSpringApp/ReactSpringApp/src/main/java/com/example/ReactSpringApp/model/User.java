package com.example.ReactSpringApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    private String role;



    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getRole() { return role; }

    public String getUser(){
        return id +" "+ name+" "+email;
    }



}
