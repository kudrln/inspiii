package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="administrator")
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id_admin;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    private java.sql.Date birthDate;

    @Column(name="hire_date")
    private java.sql.Date hireDate;

    @ManyToMany(mappedBy = "administrators")
    private List<User> users;

    public Administrator() {
    }

    public Administrator(String id, String name, String surname, java.sql.Date birthDate, java.sql.Date hireDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public java.sql.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public java.sql.Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(java.sql.Date hireDate) {
        this.hireDate = hireDate;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

