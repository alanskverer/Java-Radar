package com.compie.webstarter.controller;

import org.slf4j.Logger;
import com.compie.webstarter.model.domain.Example;
import com.compie.webstarter.provider.ExampleProvider;
import lombok.RequiredArgsConstructor;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/example")
public class ExampleController {

    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);
    private final ExampleProvider exampleProvider;

    @GetMapping
    public String get() {
        logger.info("Example log from ExampleController", ExampleController.class.getSimpleName());
        return exampleProvider.getExample();
    }

    @PostMapping()
    public Example post(@RequestParam final String name, @RequestParam final String email) {
        Example example = new Example();
        example.setName(name);
        example.setEmail(email);
        exampleProvider.createNew(example);
        return example;
    }

    @PutMapping()
    public String put(@RequestBody final String example) {
        return example;
    }

    @DeleteMapping()
    public boolean delete(@RequestBody final String example) {
        return true;
    }
}
