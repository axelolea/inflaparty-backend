package com.axelolea.inflapartybackend.controllers;


import com.axelolea.inflapartybackend.dto.ProductDto;
import com.axelolea.inflapartybackend.models.product.ProductType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("${products-path}")
public class ProductController {

    @PostMapping
    ResponseEntity<ProductDto> createProduct (
            @RequestBody ProductDto product
    ) {
        return ResponseEntity.ok(product);
    }

    @GetMapping("{id}")
    ResponseEntity<ProductDto> getProductoById (
            @PathVariable long id
    ) {
        return ResponseEntity.ok(ProductDto.builder().id(id).build());
    }

    @GetMapping("search")
    ResponseEntity<List<ProductDto>> searchProducts (
            @RequestParam(required = false) String q,
            @RequestParam(required = false) ProductType type
    ) {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PutMapping
    ResponseEntity<ProductDto> updateProduct (
            @RequestBody ProductDto product
    ) {
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteProduct (
            @PathVariable long id
    ) {

    }

}
