package com.axelolea.inflapartybackend.services.imp;


import com.axelolea.inflapartybackend.models.account.User;
import com.axelolea.inflapartybackend.repositories.UserRepository;
import com.axelolea.inflapartybackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepo;
    @Autowired
    public UserServiceImp(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAllUsers () {
        return userRepo.findAll();
    }

}
