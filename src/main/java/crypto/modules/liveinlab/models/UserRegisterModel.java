package crypto.modules.liveinlab.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserRegisterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    long userid;
    @Column(name = "username",unique = true)
    String username;
    @Column(name = "password")
    String password;
    @Column(name = "email",unique = true)
    String email;
    @Column(name = "proffesion")
    String proffesion;
    @Column(name = "sudoname")
    String sudoname;
}
