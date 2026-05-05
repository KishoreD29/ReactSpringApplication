package com.example.ReactSpringApp.service;

import com.example.ReactSpringApp.model.Doctor;
import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;



    public Doctor update(long user_id,boolean available){
        Doctor doctor =doctorRepository.findByUserId(user_id);
        System.out.println(user_id);
        if (doctor==null){
            System.out.println("NO data found");
            return null;
        }
        System.out.println("HI");
        doctor.setAvailable(available);
        return doctorRepository.save(doctor);




    }
    public List<Doctor> fetchAll(){
        return doctorRepository.findAll();
    }


}
