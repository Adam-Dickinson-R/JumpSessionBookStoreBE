package retro.rabbit.jumpsessionbe.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retro.rabbit.jumpsessionbe.models.User;
import retro.rabbit.jumpsessionbe.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
