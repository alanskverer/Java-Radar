package com.example.spring_boot_starter_proj.controller;

import com.example.spring_boot_starter_proj.model.User;
import com.example.spring_boot_starter_proj.provider.UserProvider;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/api/users")
public class UserController {

    @Autowired
    private UserProvider userProvider;



    @ApiOperation(value = "User", nickname = "user", notes="creating a new user")
    @PostMapping(path="/add")
    public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);

        userProvider.create(n);


        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {

        return userProvider.getAll();
    }
}
