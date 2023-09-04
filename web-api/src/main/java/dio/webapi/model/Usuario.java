package dio.webapi.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Usuario {
    private Integer id;
    private String login;
    private String password;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
