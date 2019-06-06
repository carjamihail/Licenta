package com.example.demo.Entities;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL , mappedBy = "courses")
    private List<Grades> grades;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitluCurs() {
        return titluCurs;
    }

    public void setTitluCurs(String titluCurs) {
        this.titluCurs = titluCurs;
    }

    public Integer getNrCredite() {
        return nrCredite;
    }

    public void setNrCredite(Integer nrCredite) {
        this.nrCredite = nrCredite;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public Integer getSemestru() {
        return semestru;
    }

    public void setSemestru(Integer semestru) {
        this.semestru = semestru;
    }

    public List<Grades> getGrades() {
        return grades;
    }

    public void setGrades(List<Grades> grades) {
        this.grades = grades;
    }
}
