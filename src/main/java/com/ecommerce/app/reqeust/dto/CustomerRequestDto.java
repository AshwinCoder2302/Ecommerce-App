package com.ecommerce.app.reqeust.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDto {
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;

}
