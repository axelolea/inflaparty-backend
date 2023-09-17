package com.axelolea.inflapartybackend.services;

import com.axelolea.inflapartybackend.dto.ProductDto;
import com.axelolea.inflapartybackend.models.product.ProductType;

import java.util.List;

public interface ProductService {
    ProductDto create (ProductDto product);
    ProductDto getById(long id);
    List<ProductDto> search(String q, ProductType type, int min, int max);
    ProductDto update(long id, ProductDto product);
    void delete (long id);
}
