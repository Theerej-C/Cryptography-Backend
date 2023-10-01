package crypto.modules.liveinlab.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserLoginModel {
    @Id
    private Long id;
    private String username;
    private String password;
    private String sudoname;
}
