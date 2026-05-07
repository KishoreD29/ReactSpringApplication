package com.example.ReactSpringApp.service;

import com.example.ReactSpringApp.model.SignUp;
import com.example.ReactSpringApp.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {
    @Autowired
    SignUpRepository signUpRepository;
    public SignUp add(SignUp data){
        return  signUpRepository.save(data);
    }

}
