package com.dio.springsecurityjwt.dtos;

import com.dio.springsecurityjwt.model.User;

public record UserResponseDTO(Integer id, String name, String username) {
    public UserResponseDTO(User user) {
        this(user.getId(), user.getName(), user.getUsername());
    }
}
