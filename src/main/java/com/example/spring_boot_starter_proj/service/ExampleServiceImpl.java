package com.example.spring_boot_starter_proj.service;
import org.springframework.stereotype.Service;

@Service()
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String index() {
        return "ye yo suckers i am from the service";
    }
}
