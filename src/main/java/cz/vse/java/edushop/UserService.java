package cz.vse.java.edushop;

import cz.vse.java.edushop.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService{

    @Override
    public List<User> getUsers() {
        final List<User> users = new ArrayList<>();
        users.add(new User("Emil", "Novak", "cerna"));
        users.add(new User("Viktor", "Kratky", "blond"));
        return users;
    }
}
