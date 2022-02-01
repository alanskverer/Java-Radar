package com.compie.webstarter.example.service;

import com.compie.webstarter.example.model.domain.Example;

import java.util.List;

public interface ExampleService {
    List<Example> getExample();

    Example createNew(Example example);
}
