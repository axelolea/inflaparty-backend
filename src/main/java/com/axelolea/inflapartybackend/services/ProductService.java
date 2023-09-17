package com.axelolea.inflapartybackend.services;

import com.axelolea.inflapartybackend.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto create (ProductDto product);
    ProductDto getById(long id);
    List<ProductDto> search();
    ProductDto update(long id, ProductDto product);
    void delete (long id);
}
