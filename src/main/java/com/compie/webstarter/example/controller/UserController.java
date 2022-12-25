package com.compie.webstarter.example.controller;

import com.compie.webstarter.example.model.dto.ExampleResponseDto;
import com.compie.webstarter.example.model.dto.UserRequestDto;
import com.compie.webstarter.example.model.dto.UserResponseDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "User Controller")
@RestController
@RequestMapping("/v1/user")
@Validated
public interface UserController {

    @GetMapping
    List<UserResponseDto> get();

    @PostMapping()
    UserResponseDto post(@RequestBody UserRequestDto userRequestDto);
}