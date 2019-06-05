package com.example.demo.Controllers;

import com.example.demo.Entities.LogIn;
import com.example.demo.service.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LogInController {
    @Autowired
    public LogInService logInService;
    @PostMapping
    public String saveLog(@RequestBody LogIn logInToSave){
        logInService.saveLog(logInToSave);
        return"ok";
    }

}
