package com.example.lab3_bytska.controller;

import com.example.lab3_bytska.entity.Users;
import com.example.lab3_bytska.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/users")
    public Flux<Users> getAllUsers() {
        return usersService.findAll();
    }

}