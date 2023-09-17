package com.axelolea.inflapartybackend.services.imp;

import com.axelolea.inflapartybackend.dto.ProductDto;
import com.axelolea.inflapartybackend.exceptions.NotFoundResourceException;
import com.axelolea.inflapartybackend.models.product.Product;
import com.axelolea.inflapartybackend.repositories.ProductRepository;
import com.axelolea.inflapartybackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.axelolea.inflapartybackend.mapper.ProductMapper.*;

@Service
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepo;
    @Autowired
    public ProductServiceImp(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public ProductDto create(ProductDto productDto) {
        Product product = mapToEntity(productDto);
        Product productSave = productRepo.save(product);
        return mapToDto(productSave);
    }

    @Override
    public ProductDto getById(long id) {
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new NotFoundResourceException(id));
        return mapToDto(product);
    }

    @Override
    public List<ProductDto> search() {
        return null;
    }

    @Override
    public ProductDto update(long id, ProductDto productDto) {
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new NotFoundResourceException(id));
        updateEntity(product, productDto);
        Product productSave = productRepo.save(product);
        return mapToDto(productSave);
    }

    @Override
    public void delete(long id) {
        productRepo.deleteById(id);
    }
}
