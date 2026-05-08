package com.example.ReactSpringApp.controller;

import com.example.ReactSpringApp.dto.LoginResponse;
import com.example.ReactSpringApp.model.Login;
import com.example.ReactSpringApp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {

    @Autowired
    LoginService service;
//    @GetMapping("/create")
//    public String getParam(@RequestParam String Userid,@RequestParam String Password  ){
//        return "Userid "+Userid+" "+"Password "+Password;
//    }

    @PostMapping("/login")
    public LoginResponse create(@RequestBody Login user){

        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        return service.verifyuser(user);

    }

}
