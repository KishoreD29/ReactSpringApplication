package com.example.ReactSpringApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // this allows all api starting with /api
public class Hello {
    @GetMapping("/test")
    public String getTest(){
        return "Working perfectly !";
    }

    // api/to    because of RequestMapping
    @GetMapping("/to")
    public String getTo(){
        return "hello";
    }

    //Path variable
    // api/1    to fetch 1
    @GetMapping("/{id}")  // this helps to get "/api/1"  the variable 1
    public String param(@PathVariable long id){
        return "working"+id;


    }

    // Request Param
    // api/test?id=1     key:id value:1
    @GetMapping("/create")
    public String getParam(@RequestParam String Userid,@RequestParam String Password  ){
        return "Userid "+Userid+" "+"Password "+Password;
    }


    @PostMapping("/create")
    public String create(@RequestBody String  body){
        return body;
    }






}
