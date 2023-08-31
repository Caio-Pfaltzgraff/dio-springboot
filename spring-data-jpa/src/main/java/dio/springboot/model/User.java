package dio.springboot.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

}