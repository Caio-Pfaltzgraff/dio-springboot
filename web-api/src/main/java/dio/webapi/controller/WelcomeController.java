package dio.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "<h1>Welcome to my Spring Boot Web API</h1>";
    }
}
