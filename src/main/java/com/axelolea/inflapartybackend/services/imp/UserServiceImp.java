package com.axelolea.inflapartybackend.services.imp;


import com.axelolea.inflapartybackend.dto.AccountDto;
import com.axelolea.inflapartybackend.models.account.User;
import com.axelolea.inflapartybackend.repositories.UserRepository;
import com.axelolea.inflapartybackend.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements AccountService {

    private final UserRepository userRepo;
    @Autowired
    public UserServiceImp(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public AccountDto getById(long id) {
        return null;
    }
}
