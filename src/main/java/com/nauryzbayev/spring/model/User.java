package com.nauryzbayev.spring.model;

import com.nauryzbayev.spring.entity.UserEntity;

public class User {
    public Long id;
    public String username;

    public static User toModel(UserEntity entity){
        User model = new User();
        model.setId(entity.getId());
        model.setUsername(entity.getUsername());
        return model;


    }
    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
