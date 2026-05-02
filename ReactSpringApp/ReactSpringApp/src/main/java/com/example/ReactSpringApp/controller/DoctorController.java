package com.example.ReactSpringApp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ReactSpringApp.model.Doctor;

@RestController
public class DoctorController {
    @PutMapping("/Doctor/{id}")
    public String getParam(@PathVariable long id, @RequestBody Doctor  doctor){
        System.out.println(id);
        System.out.println(doctor.isAvailable());
        return "Updated Sucessfully";
    }


}
