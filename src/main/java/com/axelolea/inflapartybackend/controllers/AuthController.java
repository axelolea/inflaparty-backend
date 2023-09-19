package com.axelolea.inflapartybackend.controllers;

import com.axelolea.inflapartybackend.dto.UserLogin;
import com.axelolea.inflapartybackend.dto.UserRegister;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${auth-path}")
public class AuthController {


    @PostMapping("register")
    public String register (@RequestBody UserRegister user) {
        return "";
    }

    @PostMapping("login")
    private String login (@RequestBody UserLogin user) {
        return "";
    }

}
