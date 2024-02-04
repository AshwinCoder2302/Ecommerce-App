package com.ecommerce.app.response.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemResponseDto {
    private Long orderItemId;
    private Integer quantity;
    private Double price;

    private ProductResponseDto productResponseDtoId;
    private OrderResponseDto orderResponseDtoId;
}
