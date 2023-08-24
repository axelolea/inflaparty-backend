package com.axelolea.inflapartybackend.controllers;


import com.axelolea.inflapartybackend.models.User;
import com.axelolea.inflapartybackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getListAllUsers () {
        return userService.getAllUsers();
    }

}
