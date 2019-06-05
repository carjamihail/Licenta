package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name="login")
public class LogIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

        @OneToOne()
    @JoinColumn(name = "Email",referencedColumnName="Email")
    private Student student;
    @Column(name="parola")
    private String passwd;

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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }






}
