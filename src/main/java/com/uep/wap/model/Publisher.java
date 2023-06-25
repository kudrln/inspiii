package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id_pub;

    @Column(name="name")
    private varchar(10) name;

    @Column(name="surname")
    private varchar(20) surname;

    @Column(name="nickname")
    private varchar(10) nickname not null;

    @Column(name="birth_date")
    private java.sql.Date birth_date not null;

    @Column(name="registration_date")
    private java.sql.Date registration_day;


    @ManyToMany(mappedBy = "publishers")
    private List<Publisher> publishers;

