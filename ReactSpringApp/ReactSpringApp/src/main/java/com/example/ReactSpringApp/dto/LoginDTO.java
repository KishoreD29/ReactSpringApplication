package com.example.ReactSpringApp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class LoginDTO {
    @Email(message="Invalid email format")
    private String email;
    @Size(min=6,message = "Minimum 6 characters")
    private String password;

}
