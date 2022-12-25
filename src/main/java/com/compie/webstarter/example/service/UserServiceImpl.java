package com.compie.webstarter.example.service;

import com.compie.webstarter.example.model.domain.User;
import com.compie.webstarter.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getUser() {
        log.info("getting user");
        return userRepository.findAll();
    }

    @Override
    public User createNew(User user) {
        log.info("creating new user");
        return userRepository.save(user);
    }
}
