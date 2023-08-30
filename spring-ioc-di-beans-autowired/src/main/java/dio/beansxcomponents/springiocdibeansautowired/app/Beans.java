package dio.beansxcomponents.springiocdibeansautowired.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean //quando não tem acesso ao código fonte
    public Gson gson() {
        return new Gson();
    }
}
