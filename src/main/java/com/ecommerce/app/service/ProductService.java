package com.ecommerce.app.service;

import com.ecommerce.app.reqeust.dto.ProductRequestDto;
import com.ecommerce.app.response.dto.CategoryResponseDto;
import com.ecommerce.app.response.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {

    public ProductResponseDto getProductById(Long productId);

    public List<ProductResponseDto> getAllProduct();

    public String saveProduct(ProductRequestDto productRequestDto);

    public String updateProduct(Long productId, ProductRequestDto productRequestDto);

    public String deleteProduct(Long productId);
}
