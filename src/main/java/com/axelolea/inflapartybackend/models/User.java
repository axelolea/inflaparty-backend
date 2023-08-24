package com.axelolea.inflapartybackend.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "hash_password")
    private String hashPassword;

    @Column(name="created_at")
    private final Date dateCreated = new Date();

}
