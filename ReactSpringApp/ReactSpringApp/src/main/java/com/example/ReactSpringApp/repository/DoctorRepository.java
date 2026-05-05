package com.example.ReactSpringApp.repository;

import com.example.ReactSpringApp.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    @Query("Select d from Doctor d where d.user.id=:userId")
    Doctor findByUserId(@Param("userId") Long user_id);
}

