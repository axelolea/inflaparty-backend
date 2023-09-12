package com.axelolea.inflapartybackend.models.account;

import com.axelolea.inflapartybackend.models.Review;
import com.axelolea.inflapartybackend.models.product.Product;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="accounts")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class Account {

    // Columns

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastname;

    private String phone;

    private String photoUrl;

    @Enumerated(EnumType.ORDINAL)
    private StateUser state;

    private Boolean verified;

    @CreationTimestamp
    private Instant createdOn;

    @UpdateTimestamp
    private Instant updatedOn;

    // Relationship

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    private List<Review> reviews = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name = "favorites",
            joinColumns = @JoinColumn (name = "account_id"),
            inverseJoinColumns = @JoinColumn (name = "product_id")
    )
    private List<Product> favorites = new ArrayList<>();

}
