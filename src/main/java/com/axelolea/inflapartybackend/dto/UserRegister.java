package com.axelolea.inflapartybackend.dto;


import lombok.Data;


@Data
public class UserRegister {

    private String email;
    private String password;
    private String password2;
    private String name;
    private String lastname;
    private String phone;
    private String photoUrl;

}
