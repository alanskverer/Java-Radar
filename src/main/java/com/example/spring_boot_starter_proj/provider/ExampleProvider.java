package com.example.spring_boot_starter_proj.provider;

import com.example.spring_boot_starter_proj.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class ExampleProvider {
    private final ExampleService exampleService;

    @Autowired
    public ExampleProvider(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public String index(){
       return exampleService.index();
    }
}
