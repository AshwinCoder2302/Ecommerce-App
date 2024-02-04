package com.ecommerce.app.reqeust.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemRequestDto {
    private Long orderItemId;
    private Integer quantity;
    private Double price;

    private ProductRequestDto productRequestDtoId;
    private OrderRequestDto orderRequestDtoId;
}
