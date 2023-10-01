package crypto.modules.liveinlab.controllers;

import crypto.modules.liveinlab.models.UserLoginModel;
import crypto.modules.liveinlab.models.UserRegisterModel;
import crypto.modules.liveinlab.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> userRegister(@RequestBody UserRegisterModel userRegisterModel) {
        userService.saveUser(userRegisterModel);
        return ResponseEntity.ok("This is he testing one");
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> userLogin(@RequestBody UserLoginModel userLoginModel) {
        if (userService.userLoginService(userLoginModel)) {
            return ResponseEntity.ok(Boolean.TRUE);

        }
        return ResponseEntity.ok(Boolean.FALSE);
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
