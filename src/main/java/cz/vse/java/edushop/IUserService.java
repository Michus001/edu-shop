package cz.vse.java.edushop;

import cz.vse.java.edushop.model.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers();

    void saveUser(User user);

    User getUserById(Long id);
}
