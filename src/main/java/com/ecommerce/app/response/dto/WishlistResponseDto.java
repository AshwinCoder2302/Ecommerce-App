package com.ecommerce.app.response.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishlistResponseDto {
    private Long wishlistId;
    private CustomerResponseDto customerResponseDtoId;
    private ProductResponseDto productResponseDtoId;
}
