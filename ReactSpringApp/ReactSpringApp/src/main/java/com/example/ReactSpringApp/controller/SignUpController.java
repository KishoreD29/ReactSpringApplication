package com.example.ReactSpringApp.controller;

import com.example.ReactSpringApp.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ReactSpringApp.model.SignUp;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class SignUpController {
    @Autowired
    SignUpService signUpService;


    @PostMapping("/signup")
    public SignUp signup(@RequestBody SignUp signup){
        System.out.println(signup.getName());
        return signUpService.add(signup);



    }


}
