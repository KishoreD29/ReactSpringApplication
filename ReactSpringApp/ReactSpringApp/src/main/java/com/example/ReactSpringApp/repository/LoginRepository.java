package com.example.ReactSpringApp.repository;

import com.example.ReactSpringApp.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface LoginRepository extends JpaRepository<Login,Long>{

}


