package com.axelolea.inflapartybackend.dto;


import com.axelolea.inflapartybackend.models.account.StateUser;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class AccountDto {

    private Long id;
    private String email;
    private String name;
    private String lastname;
    private String phone;
    private String photoUrl;
    private StateUser state;
    private Boolean verified;
    private Instant createdOn;
    private Instant updatedOn;


}
