package bsu.project.partnership.controller;


import bsu.project.partnership.model.Question;
import bsu.project.partnership.model.User;
import bsu.project.partnership.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bsu/v1/users")
@AllArgsConstructor
@CrossOrigin
public class UserController {
    private final UserService service;


    @GetMapping
    public List<User> findAll(){
        return service.getAll();
    }

    @PostMapping("/save_user")
    public String addUser(@RequestBody User user){
        service.addUser(user);
        return "fine";
    }

    @DeleteMapping("/delete_user")
    public void deleteQuestion(@RequestBody User user){
        service.delete(user);
    }


}
