package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name="note")
public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="IdStudent")
    private Long id_student;

    @Column(name="IdCurs")
    private Long id_curs;

    @Column(name="nota")
    private float nota;

    @Column(name = "data")
    private String date;


}
