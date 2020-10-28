package com.compie.webstarter.controller;

import com.compie.webstarter.model.domain.Example;
import com.compie.webstarter.provider.ExampleProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/example")
public class ExampleController {

    private final ExampleProvider exampleProvider;

    @GetMapping
    public String get() {
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
