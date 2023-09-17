package com.axelolea.inflapartybackend.controllers;


import com.axelolea.inflapartybackend.dto.ProductDto;
import com.axelolea.inflapartybackend.models.product.ProductType;
import com.axelolea.inflapartybackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("${products-path}")
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }




    @PostMapping
    ResponseEntity<ProductDto> createProduct (
            @RequestBody ProductDto product
    ) {
        ProductDto productDto = productService.create(product);
        return ResponseEntity.ok(productDto);
    }

    @GetMapping("{id}")
    ResponseEntity<ProductDto> getProductoById (
            @PathVariable long id
    ) {
        ProductDto productDto = productService.getById(id);
        return ResponseEntity.ok(productDto);
    }

    @GetMapping("search")
    ResponseEntity<List<ProductDto>> searchProducts (
            @RequestParam(required = false) String q,
            @RequestParam(required = false) ProductType type,
            @RequestParam(required = false) int min,
            @RequestParam(required = false) int max
    ) {
        List<ProductDto> products = productService.search();
        return ResponseEntity.ok(products);
    }

    @PutMapping("{id}")
    ResponseEntity<ProductDto> updateProduct (
            @PathVariable long id,
            @RequestBody ProductDto product
    ) {
        ProductDto productDto = productService.update(id, product);
        return ResponseEntity.ok(productDto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteProduct (
            @PathVariable long id
    ) {
        productService.delete(id);
    }

}
