package com.axelolea.inflapartybackend.services;


import com.axelolea.inflapartybackend.models.User;
import com.axelolea.inflapartybackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepo;
    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }


    public List<User> getAllUsers () {
        return userRepo.findAll();
    }


}
