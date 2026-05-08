package com.example.ReactSpringApp.controller;

import com.example.ReactSpringApp.model.Doctor;
import com.example.ReactSpringApp.service.DoctorService;
import com.example.ReactSpringApp.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @Autowired
    JwtUtil jwtUtil;


    @PutMapping("/doctoravailability")
    public Doctor getParam( @RequestParam Boolean available,HttpServletRequest request){
        System.out.println("HIT API");
        String header = request.getHeader("Authorization");

        String token = header.substring(7);

        String email = jwtUtil.extractEmail(token);

        System.out.println(available);
        System.out.println(email);
        return doctorService.update(email,available);
    }

    @GetMapping("/doctordetails")
    public List<Doctor> getDoctor(){
        System.out.println("HI");
        return doctorService.fetchAll();
    }


}
