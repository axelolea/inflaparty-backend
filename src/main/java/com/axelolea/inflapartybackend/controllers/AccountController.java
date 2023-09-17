package com.axelolea.inflapartybackend.controllers;


import com.axelolea.inflapartybackend.dto.AccountDto;
import com.axelolea.inflapartybackend.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping("{id}")
    public AccountDto getUserInfo (
             @PathVariable long id
    ) {
        return accountService.getById(id);
    }

}
