package com.example.ReactSpringApp.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
public class LoginResponse {
    private String message;
    private String role;
    private String token;

    public LoginResponse(String message,String role,String token){
        this.message=message;
        this.role=role;
        this.token=token;

    }


}
