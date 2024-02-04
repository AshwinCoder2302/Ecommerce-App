package com.ecommerce.app.controller;

import com.ecommerce.app.reqeust.dto.CategoryRequestDto;
import com.ecommerce.app.response.dto.CategoryResponseDto;
import com.ecommerce.app.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    private ResponseEntity<List<CategoryResponseDto>> getAllCategory(){
        return new ResponseEntity<>(categoryService.getAllCategory(), HttpStatus.OK);
    }

    @GetMapping("/{categoryId}")
    private ResponseEntity<CategoryResponseDto> getCategoryById(@PathVariable Long categoryId){
        return new ResponseEntity<>(categoryService.getCategoryById(categoryId), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<String> saveCategory(@RequestBody CategoryRequestDto categoryRequestDto){
        return new ResponseEntity<>(categoryService.saveCategory(categoryRequestDto), HttpStatus.OK);
    }

    @PutMapping("/{categoryId}")
    private ResponseEntity<String> updateCategory(@PathVariable Long categoryId, @RequestBody CategoryRequestDto categoryRequestDto){
        return new ResponseEntity<>(categoryService.updateCategory(categoryId, categoryRequestDto), HttpStatus.OK);
    }

    @DeleteMapping("/{categoryId}")
    private ResponseEntity<String> deleteCategory(@PathVariable Long categoryId){
        return new ResponseEntity<>(categoryService.deleteCategory(categoryId), HttpStatus.OK);
    }

}
