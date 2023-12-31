package dio.webapi.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Rest API")
                        .description("API exemplo de uso de Springboot REST API")
                        .contact(new Contact()
                                .name("Caio Pfaltzgraff")
                                .email("caio.caio@gmail.com")
                        )
                        .license(new License()
                                .name("Licença - Sua Empresa")
                                .url("http://www.seusite.com.br")
                        )
                );
    }

}
