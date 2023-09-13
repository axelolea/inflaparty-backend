package com.axelolea.inflapartybackend.models.account;


import com.axelolea.inflapartybackend.models.reservation.StateReservation;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.Date;

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

    @Column(nullable = false)
    private String addressLine;

    @Column(nullable = false)
    private String suburb;

    @Column(nullable = false)
    private String zipcode;

    private String reference;

    @CreationTimestamp
    private Instant createdOn;

    @UpdateTimestamp
    private Instant updatedOn;

    // Relationship
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

}
