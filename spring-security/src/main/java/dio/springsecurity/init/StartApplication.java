package dio.springsecurity.init;

import dio.springsecurity.model.User;
import dio.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        User user = repository.findByUsername("admin");
        if(user==null){
            List<String> roles = new ArrayList<>(Arrays.asList( "ADMIN", "USER"));
            user = new User(null, "ADMIN", "admin", passwordEncoder.encode("master123"), roles);
            repository.save(user);
        }
        user = repository.findByUsername("user");
        if(user ==null){
            List<String> roles = new ArrayList<>(List.of("USER"));
            user = new User(null, "USER", "user", passwordEncoder.encode("user123"), roles);
            repository.save(user);
        }
    }
}
