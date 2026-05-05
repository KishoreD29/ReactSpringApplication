package com.example.ReactSpringApp.controller;

import com.example.ReactSpringApp.model.Doctor;
import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class DoctorController {
    @Autowired
    DoctorService doctorService;


    @PutMapping("/Doctor/{id}")
    public Doctor getParam(@PathVariable long id, @RequestParam Boolean available){
        System.out.println("HIT API");
        System.out.println(id);
        System.out.println(available);
        return doctorService.update(id,available) ;
    }

    @GetMapping("/doctordetails")
    public List<Doctor> getDoctor(){
        System.out.println("HI");
        return doctorService.fetchAll();
    }


}
