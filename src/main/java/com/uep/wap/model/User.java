package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id_user;

    @Column(name="username")
    private String username;

    @Column(name="gender")
    private String gender;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="roles")
    private String roles;

    @Column(name="age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "id_website")
    private Website website;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_administrator",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_admin"))
    private List<Administrator> administrator;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_publisher",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_publisher"))
    private List<Publisher> publisher;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_viewer",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_view"))
    private List<Viewer> viewer;



}
