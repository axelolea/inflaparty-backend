package com.axelolea.inflapartybackend.mapper;

import com.axelolea.inflapartybackend.dto.ProductDto;
import com.axelolea.inflapartybackend.models.product.Product;

public class ProductMapper {

    public static ProductDto mapToDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .type(product.getType())
                .isAvailable(product.isAvailable())
                .build();
    }

    public static Product mapToEntity(ProductDto product) {
        return Product.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .type(product.getType())
                .available(product.isAvailable())
                .build();
    }

    public static void updateEntity (Product entity, ProductDto productDto) {

        entity.setName(productDto.getName());
        entity.setDescription(productDto.getDescription());
        entity.setPrice(productDto.getPrice());
        entity.setType(productDto.getType());
        entity.setAvailable(productDto.isAvailable());
        // entity.setUpdatedOn();

    }

}
