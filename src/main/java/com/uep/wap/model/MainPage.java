package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "main_page")
public class MainPage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "header")
    private int header;

    @Column(name = "category")
    private int category;

    @Column(name = "icons")
    private int icons;

    @OneToOne
    @JoinColumn(name = "id_website")
    private Website website;

    @OneToMany(mappedBy = "mainPage", cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToMany(mappedBy = "mainPage", cascade = CascadeType.ALL)
    private List<Category> categories;

    public MainPage() {
    }

    public MainPage(String name, int header, int category, int icons) {
        this.name = name;
        this.header = header;
        this.category = category;
        this.icons = icons;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeader() {
        return header;
    }

    public void setHeader(int header) {
        this.header = header;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getIcons() {
        return icons;
    }

    public void setIcons(int icons) {
        this.icons = icons;
    }

    public Website getWebsite() {
        return website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
