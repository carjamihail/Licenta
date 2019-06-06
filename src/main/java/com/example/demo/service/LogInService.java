package com.example.demo.service;

import com.example.demo.Entities.LogIn;
import com.example.demo.Repositories.LogInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

@Component
public class LogInService {
    @Autowired
    private LogInRepository logInRepository;

    public String saveLog(LogIn logIn){
        logInRepository.save(logIn);
        return "ok";
    }
    public UserDetails loadUserByEmail(String email){
        LogIn logIn = logInRepository.findByEmail(email);
        if(logIn == null) throw new UsernameNotFoundException(email);

        return new org.springframework.security.core.userdetails.User(logIn.getStudent().getEmail(), logIn.getPasswd());

    }
}
