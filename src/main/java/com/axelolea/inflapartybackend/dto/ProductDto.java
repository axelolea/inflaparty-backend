package com.axelolea.inflapartybackend.dto;

import com.axelolea.inflapartybackend.models.product.ProductType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private int price;
    private ProductType type;
    private boolean isAvailable;
    private long account_id;

}
