package com.example.demo.Repositories;

import com.example.demo.Entities.LogIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogInRepository extends JpaRepository<LogIn, Long > {
     LogIn findByEmail(String email);


}
