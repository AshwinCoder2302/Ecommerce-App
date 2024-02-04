package com.ecommerce.app.reqeust.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishlistRequestDto {
    private Long wishlistId;
    private CustomerRequestDto customerRequestDtoId;
    private ProductRequestDto productRequestDtoId;
}
