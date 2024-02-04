package com.ecommerce.app.response.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {
    private Long productId;
    private String SKU;
    private String description;
    private Double price;
    private Integer stock;
    private CategoryResponseDto categoryResponseDtoId;
}
