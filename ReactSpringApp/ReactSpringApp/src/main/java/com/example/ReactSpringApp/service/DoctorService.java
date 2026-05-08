package com.example.ReactSpringApp.service;

import com.example.ReactSpringApp.model.Doctor;
import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.repository.DoctorRepository;
import com.example.ReactSpringApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    UserRepository userRepository;


    public Doctor update(String email,boolean available){
        System.out.println("HELLO BY SERVICE");
        User user =userRepository.findByEmail(email);


        Doctor doctor = doctorRepository.findByUserId(user.getId());
        if(doctor == null){
            doctor = new Doctor();
            doctor.setUser(user);
        }
        doctor.setAvailable(available);

        return doctorRepository.save(doctor);

        }



    public List<Doctor> fetchAll(){
        return doctorRepository.findAll();
    }


}
