package com.axelolea.inflapartybackend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="products")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Product {

    @Id
    @Column(name="product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}