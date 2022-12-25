package com.compie.webstarter.example.controller;

import com.compie.webstarter.example.model.domain.Example;
import com.compie.webstarter.example.model.domain.User;
import com.compie.webstarter.example.model.dto.ExampleRequestDto;
import com.compie.webstarter.example.model.dto.ExampleResponseDto;
import com.compie.webstarter.example.model.dto.UserRequestDto;
import com.compie.webstarter.example.model.dto.UserResponseDto;
import com.compie.webstarter.example.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponseDto> get() {
        log.info("User log from UserController");
        final List<User> users = userService.getUser();
        log.info("getUser response: {}", users);
        return users
                .stream()
                .map(user -> UserResponseDto.builder()
                        .name(user.getName())
                        .email(user.getEmail())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDto post(UserRequestDto userRequestDto) {
        User user = User.builder()
                .name(userRequestDto.getName())
                .email(userRequestDto.getEmail())
                .password(userRequestDto.password)
                .build();
        final User savedUser = userService.createNew(user);
        return UserResponseDto.builder()
                .name(savedUser.getName())
                .email(savedUser.getEmail())
                .build();
    }

//    @Override
//    public ExampleResponseDto post(UserRequestDto userRequestDto) {
//        return null;
//    }

//    @Override
//    @PostMapping()
//    public UserResponseDto post(@Valid @RequestBody final UserRequestDto userRequestDto) {
//        User user = User.builder()
//                .name(userRequestDto.getName())
//                .email(userRequestDto.getEmail())
//                .password(userRequestDto.password)
//                .build();
//        final User savedUser = userService.createNew(user);
//        return UserResponseDto.builder()
//                .name(savedUser.getName())
//                .email(savedUser.getEmail())
//                .build();
//    }
}