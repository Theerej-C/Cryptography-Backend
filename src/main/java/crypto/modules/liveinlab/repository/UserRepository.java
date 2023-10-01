package crypto.modules.liveinlab.repository;

import crypto.modules.liveinlab.models.UserRegisterModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRegisterModel,Long> {
    UserRegisterModel findUserRegisterModelByUsername(String username);
}
