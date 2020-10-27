package com.example.spring_boot_starter_proj.service;

import com.example.spring_boot_starter_proj.model.User;

public interface UserService {

    void create(User n);

    Iterable<User> getAllUsers();
}
