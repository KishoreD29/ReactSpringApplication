package com.example.ReactSpringApp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class SignUpDTO {
    @NotBlank(message = "Name is required")
    private String name;

    @Email(message="Invalid email format")
    private String email;

    @Size(min=6,message = "password has to be 6 characters")
    private String password;
    private String role;

}
