package com.axelolea.inflapartybackend.models.reservation;

import com.axelolea.inflapartybackend.models.product.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="reservation_product")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class ReservationProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int price;

    // Relationships

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

}