package dio.beansxcomponents.springiocdibeansautowired.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //quando é uma classe que tem a finalidade de ser provida no conceito de injeção de dependências
public class ConversorJson {
//    private Gson gson = new Gson();
    @Autowired
    private Gson gson;
    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
