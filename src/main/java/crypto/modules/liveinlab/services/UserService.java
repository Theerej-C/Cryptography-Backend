package crypto.modules.liveinlab.services;

import crypto.modules.liveinlab.models.UserLoginModel;
import crypto.modules.liveinlab.models.UserRegisterModel;
import crypto.modules.liveinlab.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@Data
//@AllArgsConstructor
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void saveUser(UserRegisterModel user){
        userRepository.save(user);
    }
    public Collection<UserRegisterModel> getAllUsers(){
        return Streamable.of(userRepository.findAll()).toList();
    }
    public void deleteUser(long id){
        userRepository.deleteById(id);
    }
    public List<UserRegisterModel> searchUserById(long id){
        return userRepository.findById(id).stream().toList();
    }
    public boolean userLoginService(UserLoginModel userLoginModel){
        UserRegisterModel userRegisterModel = userRepository.findUserRegisterModelByUsername(userLoginModel.getUsername());
        if(userRegisterModel.getPassword().equals(userLoginModel.getPassword())){
            return true;
        }
        return false;
    }
}
