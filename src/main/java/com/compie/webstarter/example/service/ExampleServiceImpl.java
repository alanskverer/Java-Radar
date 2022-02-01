package com.compie.webstarter.example.service;

import com.compie.webstarter.example.model.domain.Example;
import com.compie.webstarter.example.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    private final ExampleRepository exampleRepository;

    @Override
    public List<Example> getExample() {
        log.info("getting example");
        return exampleRepository.findAll();
    }

    @Override
    public Example createNew(Example example) {
        log.info("creating new example");
        return exampleRepository.save(example);
    }
}
