package com.ecommerce.app.reqeust.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {
    private Long productId;
    private String SKU;
    private String description;
    private Double price;
    private Integer stock;
    private CategoryRequestDto categoryRequestDtoId;
}
