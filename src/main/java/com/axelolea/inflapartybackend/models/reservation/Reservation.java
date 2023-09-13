package com.axelolea.inflapartybackend.models.reservation;

import com.axelolea.inflapartybackend.models.account.Account;
import com.axelolea.inflapartybackend.models.account.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="reservations")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private StateReservation state;

    private int totalPrice;

    private Date start_date;

    private Date end_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

}
