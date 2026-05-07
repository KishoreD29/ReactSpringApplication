package com.example.ReactSpringApp.repository;

import com.example.ReactSpringApp.model.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp,Long> {
}
