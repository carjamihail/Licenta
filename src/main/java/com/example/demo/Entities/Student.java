package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="Studenti")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name="Nume")
    private String nume;
    //@NotNull
    @Column(name="Prenume")
    private String prenume;
    //@NotNull
    @Column(name="NumarMatricol")
    private String numarMatricol;
    //@NotNull
    @Column(name="CNP")
    private Long cnp;
    //@NotNull
    @Column(name="Email")
    private String email;
    //@NotNull
    @Column(name="AnStudiu")
    private int anStudiu;
    //@NotNull
    @Column(name="Buget")
    private boolean buget;


    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public Long getCnp() {
        return cnp;
    }

    public String getEmail() {
        return email;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public boolean isBuget() {
        return buget;
    }
}
