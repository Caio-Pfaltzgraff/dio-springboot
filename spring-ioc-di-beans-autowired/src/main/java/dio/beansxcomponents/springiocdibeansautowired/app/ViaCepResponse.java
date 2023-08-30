package dio.beansxcomponents.springiocdibeansautowired.app;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ViaCepResponse {
    private String cep;
    private String logradouro;
    private String localidade;

    @Override
    public String toString() {
        return "ViaCepResponse{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
