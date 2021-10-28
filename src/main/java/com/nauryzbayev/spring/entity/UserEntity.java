package com.nauryzbayev.spring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String username;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
    private List<TodoEntity> todos;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private  String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity() {
    }
}
