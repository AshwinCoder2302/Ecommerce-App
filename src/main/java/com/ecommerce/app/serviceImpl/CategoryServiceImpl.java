package com.ecommerce.app.serviceImpl;

import com.ecommerce.app.entity.Category;
import com.ecommerce.app.repository.CategoryRepository;
import com.ecommerce.app.reqeust.dto.CategoryRequestDto;
import com.ecommerce.app.response.dto.CategoryResponseDto;
import com.ecommerce.app.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategoryResponseDto getCategoryById(Long categoryId) {
        Optional<Category> category = categoryRepository.findById(categoryId);
        if(category.isPresent()){
            CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
            BeanUtils.copyProperties(category.get(), categoryResponseDto);
            return categoryResponseDto;
        }else {
            return null;
        }
    }

    @Override
    public List<CategoryResponseDto> getAllCategory() {
        List<Category> categoryList = categoryRepository.findAll();
        List<CategoryResponseDto> categoryResponseDtoList = categoryList.stream().map(category -> convertCategoryResponse(category)).toList();
        return categoryResponseDtoList;
    }

    @Override
    public String saveCategory(CategoryRequestDto categoryRequestDto) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryRequestDto, category);
        Category savedCategory = categoryRepository.save(category);
        if(savedCategory != null) {
            return "Saved Successfully";
        } else {
            return null;
        }
    }

    @Override
    public String updateCategory(Long categoryId, CategoryRequestDto categoryRequestDto) {
        Optional<Category> existingCategory = categoryRepository.findById(categoryId);
        if(existingCategory.isPresent()) {
            Category categoryNew = existingCategory.get();
            categoryNew.setName(categoryRequestDto.getName());
            Category savedCategory = categoryRepository.save(categoryNew);
            if(savedCategory != null) {
                return "Updated Successfully";
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Optional<Category> existingCategory = categoryRepository.findById(categoryId);
        if(existingCategory.isPresent()) {
            categoryRepository.deleteById(categoryId);
            return "Deleted Successfully";
        } else {
            return null;
        }
    }

    public CategoryResponseDto convertCategoryResponse(Category category){
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        BeanUtils.copyProperties(category, categoryResponseDto);
        return categoryResponseDto;
    }
}
