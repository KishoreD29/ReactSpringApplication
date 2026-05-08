package com.example.ReactSpringApp.service;

import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User add(User data){
        return  userRepository.save(data);
    }

}
