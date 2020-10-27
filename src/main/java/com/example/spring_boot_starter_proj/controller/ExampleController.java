package com.example.spring_boot_starter_proj.controller;

import com.example.spring_boot_starter_proj.provider.ExampleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @Autowired
    private ExampleProvider exampleProvider;

    @GetMapping
    public String get() {
        return exampleProvider.index();
    }

    @PostMapping("/add")
    public String post(@RequestBody final String example) {
        return example;
    }

    @PutMapping("/update")
    public String put(@RequestBody final String example) {
        return example;
    }
}
