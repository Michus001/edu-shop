package cz.vse.java.edushop;

import cz.vse.java.edushop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.created(URI.create("/users/"+user.getId())).build();
    }
}
