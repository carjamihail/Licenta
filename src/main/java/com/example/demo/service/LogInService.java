package com.example.demo.service;

import com.example.demo.Entities.LogIn;
import com.example.demo.Repositories.LogInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogInService {
    @Autowired
    private LogInRepository logInRepository;

    public String saveLog(LogIn logIn){
        logInRepository.save(logIn);
        return "ok";
    }
}
