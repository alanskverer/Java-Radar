package com.compie.webstarter.example.controller;

import com.compie.webstarter.example.model.domain.Example;
import com.compie.webstarter.example.model.dto.ExampleResponseDto;
import com.compie.webstarter.example.service.ExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExampleControllerImpl implements ExampleController {

    private final ExampleService exampleService;

    @GetMapping
    public List<ExampleResponseDto> get() {
        log.info("Example log from ExampleController");
        final List<Example> examples = exampleService.getExample();
        log.info("getExample response: {}", examples);
        return examples
                .stream()
                .map(example -> ExampleResponseDto.builder()
                        .name(example.getName())
                        .email(example.getEmail())
                        .build())
                .collect(Collectors.toList());
    }

    @PostMapping()
    public ExampleResponseDto post(@RequestParam final String name, @RequestParam final String email) {
        Example example = Example.builder()
                .name(name)
                .email(email)
                .build();
        final Example savedExample = exampleService.createNew(example);
        return ExampleResponseDto.builder()
                .name(savedExample.getName())
                .email(savedExample.getEmail())
                .build();
    }
}