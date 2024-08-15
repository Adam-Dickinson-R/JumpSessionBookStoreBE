package retro.rabbit.jumpsessionbe.Services;

import org.springframework.stereotype.Service;
import retro.rabbit.jumpsessionbe.Models.User;
import retro.rabbit.jumpsessionbe.Respositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public boolean deleteUserById(Long id) {
        userRepository.deleteById(id);
        return true;
    }
}
