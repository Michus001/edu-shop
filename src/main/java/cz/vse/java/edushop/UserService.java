package cz.vse.java.edushop;

import cz.vse.java.edushop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(final User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User getUserById(final Long id) {
        return userRepository.getOne(id);
    }
}
