package com.axelolea.inflapartybackend.repositories;

import com.axelolea.inflapartybackend.models.product.Product;
import com.axelolea.inflapartybackend.models.product.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT p from Product p where " +
            "p.name like concat('%', :q , '%') and " +
            "p.available = true and " +
            "p.type = :type and " +
            "p.price between :min and :max")
    List<Product> searchProductsQuery (
            @Param("q") String q,
            @Param("type") ProductType type,
            @Param("min") int minPrice,
            @Param("max") int maxPrice
    );

}
