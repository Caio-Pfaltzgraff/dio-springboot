package com.dio.springsecurityjwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WelcomeController {

    @GetMapping
    public ResponseEntity<Map<String, String>> wellcome(){
        return ResponseEntity.ok(Map.of("text", "Welcome to my Spring Boot API"));
    }

    @GetMapping("/admin")
    public ResponseEntity<Map<String, String>> admin(){
        return ResponseEntity.ok(Map.of("auth", "ADMIN"));
    }

}
