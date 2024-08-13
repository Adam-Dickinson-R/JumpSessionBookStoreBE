package retro.rabbit.jumpsessionbe.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retro.rabbit.jumpsessionbe.Models.User;
import retro.rabbit.jumpsessionbe.Services.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/get-users")
    public List<User> getUsers() {
      return userService.getUsers();
    }

    @GetMapping(value = "/get-user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping(value = "/create-user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping(value = "/delete-user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        if (userService.deleteUserById(id)) {
            return ResponseEntity.ok("User deleted successfully");
        }
        return ResponseEntity.ok("User could not be deleted.");
    }
}
