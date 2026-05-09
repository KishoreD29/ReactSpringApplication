package com.example.ReactSpringApp.service;

import com.example.ReactSpringApp.dto.SignUpDTO;
import com.example.ReactSpringApp.dto.UserResponse;
import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public UserResponse add(SignUpDTO data){
        User user=new User();
        user.setEmail(data.getEmail());
        user.setName(data.getName());
        user.setRole(data.getRole());
        String password= data.getPassword();
        String encoded=passwordEncoder.encode(password);
        user.setPassword(encoded);
        userRepository.save(user);


        UserResponse userResponse=new UserResponse();
        userResponse.setEmail(data.getEmail());
        userResponse.setName(data.getName());
        userResponse.setRole(data.getRole());

        return userResponse;
    }

}
