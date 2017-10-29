package Controller;

import Model.User;
import Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public @ResponseBody
    List<User> getAllUsers() {
        return userService.getAllUsers();

    }

}
