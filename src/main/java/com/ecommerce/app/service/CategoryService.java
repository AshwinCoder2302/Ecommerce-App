package com.ecommerce.app.service;

import com.ecommerce.app.reqeust.dto.CategoryRequestDto;
import com.ecommerce.app.response.dto.CategoryResponseDto;

import java.util.List;

public interface CategoryService {

    public CategoryResponseDto getCategoryById(Long categoryId);

    public List<CategoryResponseDto> getAllCategory();

    public String saveCategory(CategoryRequestDto categoryRequestDto);

    public String updateCategory(Long categoryId, CategoryRequestDto categoryRequestDto);

    public String deleteCategory(Long categoryId);

}
