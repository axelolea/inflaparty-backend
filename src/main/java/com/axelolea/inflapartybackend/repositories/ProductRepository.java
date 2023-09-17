package com.axelolea.inflapartybackend.repositories;

import com.axelolea.inflapartybackend.models.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }
