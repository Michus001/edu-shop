package cz.vse.java.edushop;

import cz.vse.java.edushop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/users")
    public List<User> getUser() {
        return userService.getUsers();
    }
}
