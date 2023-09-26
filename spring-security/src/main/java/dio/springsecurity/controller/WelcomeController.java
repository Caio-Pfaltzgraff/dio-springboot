package dio.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class WelcomeController {
    @GetMapping("/")
    public Map<String, String> welcome(){
        return Map.of("title", "Welcome to my Spring Boot API.");
    }

    @GetMapping("/users")
    public Map<String, String> users() {
        return Map.of("auth", "USER");
    }

    @GetMapping("/admin")
    public Map<String, String> managers() {
        return Map.of("auth", "ADMIN");
    }
}
