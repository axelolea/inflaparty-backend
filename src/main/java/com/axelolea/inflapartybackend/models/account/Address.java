package com.axelolea.inflapartybackend.models.account;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="addresses")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class Address {

    // Columns

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "address_line", nullable = false)
    private String addressLine;

    @Column(name = "suburb", nullable = false)
    private String suburb;

    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @Column(name = "reference")
    private String reference;


    // Relationship
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

}
