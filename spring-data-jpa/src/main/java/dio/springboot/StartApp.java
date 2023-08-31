package dio.springboot;

import dio.springboot.model.User;
import dio.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new User(null, "Ruan", "rubrabo16", "4321"));

        for (User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
