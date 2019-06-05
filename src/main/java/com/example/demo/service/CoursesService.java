package com.example.demo.service;

import com.example.demo.Repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class CoursesService {
    @Autowired
    public CoursesRepository coursesRepository;

}
