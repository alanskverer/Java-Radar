package com.compie.webstarter.example.controller;

import com.compie.webstarter.example.model.dto.ExampleResponseDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Example Controller")
@RestController
@RequestMapping("/v1/example")
@Validated
public interface ExampleController {

    @GetMapping
    List<ExampleResponseDto> get();

    @PostMapping()
    ExampleResponseDto post(@RequestParam final String name, @RequestParam final String email);
}