package com.ecommerce.app.response.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentResponseDto {
    private Long shipmentId;
    private LocalDateTime shipmentDate;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private CustomerResponseDto customerResponseDtoId;

}

