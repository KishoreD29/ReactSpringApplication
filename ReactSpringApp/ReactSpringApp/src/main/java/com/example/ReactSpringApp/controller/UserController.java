package com.example.ReactSpringApp.controller;

import com.example.ReactSpringApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ReactSpringApp.model.User;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired
    UserService signUpService;

    @Autowired
    PasswordEncoder passwordEncoder;


    @PostMapping("/signup")
    public User signup(@RequestBody User user){
        System.out.println("HI i am api");
        System.out.println(user.getName());
        String password= user.getPassword();
        String encoded=passwordEncoder.encode(password);
        user.setPassword(encoded);
        return signUpService.add(user);



    }


}
