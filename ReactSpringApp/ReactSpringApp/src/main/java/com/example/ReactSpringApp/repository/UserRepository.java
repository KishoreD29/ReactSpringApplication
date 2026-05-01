package com.example.ReactSpringApp.repository;

import com.example.ReactSpringApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User,Long>{}


