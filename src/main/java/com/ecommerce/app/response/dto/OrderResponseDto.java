package com.ecommerce.app.response.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDto {
    private Long orderId;
    private LocalDateTime orderDate;
    private Double totalPrice;
    private CustomerResponseDto customerResponseDtoId;
    private ShipmentResponseDto shipmentResponseDtoId;
    private PaymentResponseDto paymentRequestDtoId;
}
