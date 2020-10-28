package com.compie.webstarter.controller;

import com.compie.webstarter.model.domain.Example;
import com.compie.webstarter.provider.ExampleProvider;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/example")
public class ExampleController {

    private final ExampleProvider exampleProvider;

    public ExampleController(final ExampleProvider exampleProvider) {
        this.exampleProvider = exampleProvider;
    }

    @GetMapping
    public String get() {
        return exampleProvider.getExample();
    }

    @ApiOperation(value = "Example", nickname = "exmpl", notes="creating a new Example")
    @PostMapping()
    public Example post(@RequestParam final String name, @RequestParam final String email) {
        Example exmpl = new Example();
        exmpl.setName(name);
        exmpl.setEmail(email);
        exampleProvider.createNew(exmpl);
        return exmpl;
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
