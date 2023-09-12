package com.axelolea.inflapartybackend.controllers;


import com.axelolea.inflapartybackend.models.account.User;
import com.axelolea.inflapartybackend.services.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImp userService;
    @Autowired
    public UserController(UserServiceImp userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getListAllUsers () {
        return userService.getAllUsers();
    }

}
