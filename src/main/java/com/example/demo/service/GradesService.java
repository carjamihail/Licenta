package com.example.demo.service;

import com.example.demo.Repositories.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GradesService {
    @Autowired
    public GradesRepository gradesRepository;

}
