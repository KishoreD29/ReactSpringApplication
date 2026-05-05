package com.example.ReactSpringApp.service;

import com.example.ReactSpringApp.model.Doctor;
import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.repository.DoctorRepository;
import com.example.ReactSpringApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository Repository;

    @Autowired
    DoctorRepository doctorRepository;
    public User addUser(User user){
        System.out.println("submitted");
        User savedUser= Repository.save(user);

        if(user.getRole().equals("Doctor")){
            Doctor d=new Doctor();
            d.setAvailable(false);
            d.setUser(user);

            doctorRepository.save(d);
        }
        return savedUser;




    }




}
