package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="website")
public class Website {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id_website;

    @Column(name="type")
    private String type;

    @Column(name="name")
    private String name;

    @Column(name="creation_date")
    private java.sql.Date creationDate;

    @OneToMany(mappedBy = "website", cascade = CascadeType.ALL)
    private List<User> users;

    public Website() {
    }

    public Website(String type, String name, java.sql.Date creationDate) {
        this.type = type;
        this.name = name;
        this.creationDate = creationDate;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.sql.Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.sql.Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}