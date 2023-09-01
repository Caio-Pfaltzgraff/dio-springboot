package dio.springboot;

import dio.springboot.model.User;
import dio.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.filtrarPorNome("Caio");
        for (User u : users) {
            System.out.println(u);
        }
    }

    private void insertUser() {
        repository.save(new User(null, "Caio Pfaltzgraff", "kaio0416", "2468"));

        for (User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
