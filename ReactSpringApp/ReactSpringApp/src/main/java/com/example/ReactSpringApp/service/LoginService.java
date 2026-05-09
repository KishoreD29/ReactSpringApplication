package com.example.ReactSpringApp.service;

import com.example.ReactSpringApp.dto.LoginDTO;
import com.example.ReactSpringApp.dto.LoginResponse;
import com.example.ReactSpringApp.model.User;
import com.example.ReactSpringApp.repository.UserRepository;
import com.example.ReactSpringApp.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;

    public LoginResponse verifyuser(LoginDTO loginDTO){
        System.out.println("submitted");
        System.out.println(loginDTO.getEmail());
        User u=userRepository.findByEmail(loginDTO.getEmail());
        if (u==null){
            return new LoginResponse("NOT FOUND","NA",null);
        }
        if(loginDTO.getPassword() == null || u.getPassword() == null){
            return new LoginResponse("INVALID DATA", "NA",null);
        }

        String email=loginDTO.getEmail();
        String password=loginDTO.getPassword();
        String token=jwtUtil.generateToken(email);

        if(passwordEncoder.matches(password, u.getPassword())){
            return  new LoginResponse("USER FOUND",u.getRole(),token );
        }
        return new LoginResponse("INVALID PASSWORD","NA",null);





    }




}
