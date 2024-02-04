package com.ecommerce.app.reqeust.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDto {
    private Long orderId;
    private LocalDateTime orderDate;
    private Double totalPrice;
    private CustomerRequestDto customerRequestDtoId;
    private ShipmentRequestDto shipmentRequestDtoId;
    private PaymentRequestDto paymentRequestDtoId;
}
