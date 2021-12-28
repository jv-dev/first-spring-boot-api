package com.firstapi.first.rest.api.spring.boot.controller;

import com.firstapi.first.rest.api.spring.boot.model.User;
import com.firstapi.first.rest.api.spring.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/user/{code}")
    public ResponseEntity consult(@PathVariable("code") Integer code) {
        return repository.findById(code)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/user/save")
    public User register(@RequestBody User user) {
        return repository.save(user);
    }

}
