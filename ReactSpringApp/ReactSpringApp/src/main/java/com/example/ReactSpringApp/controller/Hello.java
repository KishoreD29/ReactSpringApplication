package com.example.ReactSpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/test")
    public String test(){
        return "Working";
    }

    @PostMapping("/user")
    public User user(@RequestBody ){

    }




}
