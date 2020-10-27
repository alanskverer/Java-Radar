package com.example.spring_boot_starter_proj.service;

import com.example.spring_boot_starter_proj.model.User;
import com.example.spring_boot_starter_proj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User n) {
        userRepository.save(n);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return  userRepository.findAll();
    }
}
