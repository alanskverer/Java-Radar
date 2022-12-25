package com.compie.webstarter.example.repository;

import com.compie.webstarter.example.model.domain.Example;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepository extends CrudRepository<Example, Integer> {

    List<Example> findAll();



    Example save(Example example);
}