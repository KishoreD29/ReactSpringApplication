package com.example.ReactSpringApp.controller;

import com.example.ReactSpringApp.dto.SignUpDTO;
import com.example.ReactSpringApp.dto.UserResponse;
import com.example.ReactSpringApp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.dto.SignUpDTO;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired
    UserService signUpService;

    @Autowired
    PasswordEncoder passwordEncoder;


    @PostMapping("/signup")
    public UserResponse signup(@Valid @RequestBody SignUpDTO dto){
        System.out.println("HI i am api");

        return signUpService.add(dto);



    }


}
