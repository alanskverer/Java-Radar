package com.compie.webstarter.example.service;

import com.compie.webstarter.example.model.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUser();

    User createNew(User user);
}
