package com.compie.webstarter.example.controller;

import com.compie.webstarter.example.model.domain.Example;
import com.compie.webstarter.example.model.dto.ExampleRequestDto;
import com.compie.webstarter.example.model.dto.ExampleResponseDto;
import com.compie.webstarter.example.service.ExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExampleControllerImpl implements ExampleController {

    private final ExampleService exampleService;

    @RequestMapping("/alan")
    public ExampleResponseDto getTest() {
        Example ex = new Example(3,"Alan","wow@gmail.comm");
        final Example savedExample = exampleService.createNew(ex);
        return ExampleResponseDto.builder()
                .name(savedExample.getName())
                .email(savedExample.getEmail())
                .build();
    }

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

//    @PostMapping()
//    public ExampleResponseDto post(@Valid @RequestBody final ExampleRequestDto exampleRequestDto) {
//        Example example = Example.builder()
//                .name(exampleRequestDto.getName())
//                .email(exampleRequestDto.getEmail())
//                .build();
//        final Example savedExample = exampleService.createNew(example);
//        return ExampleResponseDto.builder()
//                .name(savedExample.getName())
//                .email(savedExample.getEmail())
//                .build();
//    }
}