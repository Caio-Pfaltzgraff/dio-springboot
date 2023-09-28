package com.dio.springsecurityjwt.controller;

import com.dio.springsecurityjwt.dtos.Login;
import com.dio.springsecurityjwt.dtos.TokenDTO;
import com.dio.springsecurityjwt.model.User;
import com.dio.springsecurityjwt.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private AuthenticationManager manager;
    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity login(@RequestBody Login login) {
        var authToken = new UsernamePasswordAuthenticationToken(login.username(), login.password());
        var auth = manager.authenticate(authToken);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new TokenDTO(token));
    }

}
