package com.axelolea.inflapartybackend.services.imp;

import com.axelolea.inflapartybackend.dto.ProductDto;
import com.axelolea.inflapartybackend.exceptions.NotFoundResourceException;
import com.axelolea.inflapartybackend.mapper.ProductMapper;
import com.axelolea.inflapartybackend.models.product.Product;
import com.axelolea.inflapartybackend.models.product.ProductType;
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
                .orElseThrow(() -> new NotFoundResourceException(id, "Product"));
        return mapToDto(product);
    }

    @Override
    public List<ProductDto> search(String q, ProductType type, int min, int max) {

        List<Product> products = productRepo.searchProductsQuery(q, type, min, max);

        return products.stream()
                .map(ProductMapper::mapToDto)
                .toList();
    }

    @Override
    public ProductDto update(long id, ProductDto productDto) {
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new NotFoundResourceException(id, "Product"));
        updateEntity(product, productDto);
        Product productSave = productRepo.save(product);
        return mapToDto(productSave);
    }

    @Override
    public void delete(long id) {

        if(!productRepo.existsById(id))
            throw new NotFoundResourceException("No founded");

        productRepo.deleteById(id);
    }
}
