package com.example.ReactSpringApp.repository;

import com.example.ReactSpringApp.model.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    Doctor findByUserId(long id);
}

