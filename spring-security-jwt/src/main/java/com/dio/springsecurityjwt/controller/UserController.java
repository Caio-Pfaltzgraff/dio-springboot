package com.dio.springsecurityjwt.controller;

import com.dio.springsecurityjwt.dtos.UserResponseDTO;
import com.dio.springsecurityjwt.model.User;
import com.dio.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity postUser(@RequestBody User user) {
        if(userService.findByUsername(user.getUsername()) != null)
            return ResponseEntity.badRequest().build();

        userService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> users() {
        return ResponseEntity.ok(Map.of("auth", "USER"));
    }
}
