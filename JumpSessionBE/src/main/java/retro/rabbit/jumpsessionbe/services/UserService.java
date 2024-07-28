package retro.rabbit.jumpsessionbe.services;

import org.springframework.stereotype.Service;
import retro.rabbit.jumpsessionbe.models.User;
import retro.rabbit.jumpsessionbe.respositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
