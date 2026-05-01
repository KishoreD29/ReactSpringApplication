package com.example.ReactSpringApp.service;

import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository Repository;
    public User addUser(User user){
        System.out.println("submitted");
        return Repository.save(user);


    }


}
