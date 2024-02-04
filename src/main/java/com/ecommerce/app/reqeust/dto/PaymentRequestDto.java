package com.ecommerce.app.reqeust.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequestDto {
    private Long paymentId;
    private LocalDateTime paymentDate;
    private String paymentType;
    private Double amount;
    private CustomerRequestDto customerRequestDtoId;

}
