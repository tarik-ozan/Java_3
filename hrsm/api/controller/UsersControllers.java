package hrsmproject.hrsm.api.controller;

import hrsmproject.hrsm.business.abstracts.UserService;
import hrsmproject.hrsm.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersControllers {

    private UserService userService;
    @Autowired
    public UsersControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public List<User> getAll(){
    return this.userService.getAll();
}

}
