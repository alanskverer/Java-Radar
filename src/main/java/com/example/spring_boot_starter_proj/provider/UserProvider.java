package com.example.spring_boot_starter_proj.provider;

import com.example.spring_boot_starter_proj.model.User;
import com.example.spring_boot_starter_proj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class UserProvider {

    @Autowired
    private UserService userService;

    public void create(User n) {
        userService.create(n);
    }

    public Iterable<User> getAll() {
        return userService.getAllUsers();
    }
}
