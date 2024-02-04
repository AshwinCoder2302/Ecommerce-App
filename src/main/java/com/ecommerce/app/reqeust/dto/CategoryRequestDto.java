package com.ecommerce.app.reqeust.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequestDto {
    private Long categoryId;
    private String name;

}
