package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name="Cursuri")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="TitluCurs")
    private String titluCurs;

    @Column(name="NrCredite")
    private Integer nrCredite;

    @Column(name = "An")
    private Integer an;

    @Column(name = "Semestrul")
    private Integer semestru;
}
