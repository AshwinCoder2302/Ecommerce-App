package com.ecommerce.app.reqeust.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartRequestDto {

    private Long cardId;
    private Integer quantity;
    private CustomerRequestDto customerRequestDtoId;
    private ProductRequestDto productRequestDtoId;
}
