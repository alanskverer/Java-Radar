package com.example.spring_boot_starter_proj.controller;

import com.example.spring_boot_starter_proj.provider.ExampleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private ExampleProvider exampleProvider;

    @RequestMapping(method = RequestMethod.GET, value = "/api/get")
    public String index() {
        return exampleProvider.index();
    }
}
