package com.axelolea.inflapartybackend.services.imp;


import com.axelolea.inflapartybackend.dto.AccountDto;
import com.axelolea.inflapartybackend.exceptions.NotFoundResourceException;
import com.axelolea.inflapartybackend.models.account.Account;
import com.axelolea.inflapartybackend.repositories.AccountRepository;
import com.axelolea.inflapartybackend.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.axelolea.inflapartybackend.mapper.AccountMapper.mapToDto;

@Service
public class AccountServiceImp implements AccountService {

    private final AccountRepository accountRepo;
    @Autowired
    public AccountServiceImp(AccountRepository accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public AccountDto getById(long id) {
        Account account = accountRepo.findById(id)
                .orElseThrow(() -> new NotFoundResourceException(id, "Account"));
        return mapToDto(account);
    }
}
