package com.compie.webstarter.example.repository;

import com.compie.webstarter.example.model.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();
    User save(User user);
}