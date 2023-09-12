package com.axelolea.inflapartybackend.models.account;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class User {

    // Columns

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String hashPassword;


    //  Relationships

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private Account account;

}
