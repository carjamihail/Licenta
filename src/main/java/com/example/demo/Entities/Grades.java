package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name="note")
public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="IdStudent",referencedColumnName ="Id" )
    private Student student;

    @ManyToOne
    @JoinColumn(name="IdCurs",referencedColumnName = "Id")
    private Courses courses;

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }


    @Column(name="nota")
    private float nota;

    @Column(name = "data")
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
