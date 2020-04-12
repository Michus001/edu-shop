package cz.vse.java.edushop;

import cz.vse.java.edushop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("web")
public class UserWebController {

    @Autowired
    private IUserService userService;

    @RequestMapping("users")
    public ModelAndView getUsers() {
        return new ModelAndView("users").addObject("users", userService.getUsers());
    }

    @RequestMapping(value = "users", method = RequestMethod.POST)
    public ModelAndView addUser(User user) {
        userService.saveUser(user);
        return getUsers();
    }
}
