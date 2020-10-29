package com.compie.webstarter.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import com.compie.webstarter.model.domain.Example;
import com.compie.webstarter.provider.ExampleProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Example Controller")
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/example")
public class ExampleController {

    private final ExampleProvider exampleProvider;

    @GetMapping
    public String get() {
        log.info("Example log from ExampleController");
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
