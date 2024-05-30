package com.techdive.users_posts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/users")
public class UsersController {

    @GetMapping
    public String getUsers(){
        return "hello users..";
    }
}
