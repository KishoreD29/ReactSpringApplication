package com.example.ReactSpringApp.controller;

import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    UserService service;
//    @GetMapping("/create")
//    public String getParam(@RequestParam String Userid,@RequestParam String Password  ){
//        return "Userid "+Userid+" "+"Password "+Password;
//    }

    @PostMapping("/user")
    public User create(@RequestBody User user){
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Role: "+user.getRole());
        return service.addUser(user);

    }

}
