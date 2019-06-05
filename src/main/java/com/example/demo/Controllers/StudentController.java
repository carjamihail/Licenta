package com.example.demo.Controllers;

import com.example.demo.Entities.Student;
import com.example.demo.service.StudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/licenta")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/merge")
    public String test(){
        return"merge";
    }

    @GetMapping("/students")
    public List<Student> getAll()

    {
        return studentService.getAll();

    }

    @GetMapping("/student/{id}")
    public Student getStudentByID(@PathVariable("id") Long id)  throws NotFoundException {
        return studentService.getById(id);
    }

    @PostMapping ("/student")
    public String saveStudent(@RequestBody Student studentToSave) {
        studentService.saveStudent(studentToSave);
     return "ok";
    }
}
