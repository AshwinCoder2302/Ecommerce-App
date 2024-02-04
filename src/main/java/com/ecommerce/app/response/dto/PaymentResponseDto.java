package com.ecommerce.app.response.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDto {
    private Long paymentId;
    private LocalDateTime paymentDate;
    private String paymentType;
    private Double amount;
    private CustomerResponseDto customerResponseDtoId;

}
