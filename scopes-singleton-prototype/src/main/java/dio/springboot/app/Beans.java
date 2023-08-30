package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")// cria 2 objetos Remetente, pois antes criava apenas 1 mesmo com 2 @Autowired
    public Remetente remetente() {
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        return new Remetente("Digital Innovation One", "noreply@dio.com.br");
    }
}
