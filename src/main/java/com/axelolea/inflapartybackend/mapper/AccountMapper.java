package com.axelolea.inflapartybackend.mapper;

import com.axelolea.inflapartybackend.dto.AccountDto;
import com.axelolea.inflapartybackend.models.account.Account;

public class AccountMapper {

    public static AccountDto mapToDto (Account account) {
        return AccountDto.builder()
                .id(account.getId())
                .name(account.getName())
                .lastname(account.getLastname())
                .email(account.getUser().getEmail())
                .phone(account.getPhone())
                .photoUrl(account.getPhotoUrl())
                .verified(account.getVerified())
                .state(account.getState())
                .build();
    }

}
