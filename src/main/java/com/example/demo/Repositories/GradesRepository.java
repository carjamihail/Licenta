package com.example.demo.Repositories;

import com.example.demo.Entities.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository <Grades, Long> {
}
