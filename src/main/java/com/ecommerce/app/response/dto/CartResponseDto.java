package com.ecommerce.app.response.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponseDto {
    private Long cardId;
    private Integer quantity;
    private CustomerResponseDto customerResponseDtoId;
    private ProductResponseDto productResponseDtoId;
}
