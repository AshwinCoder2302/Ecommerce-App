package com.ecommerce.app.controller;

import com.ecommerce.app.reqeust.dto.ProductRequestDto;
import com.ecommerce.app.response.dto.ProductResponseDto;
import com.ecommerce.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    private ResponseEntity<List<ProductResponseDto>> getAllProduct(){
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    private ResponseEntity<ProductResponseDto> getProductById(@PathVariable Long productId){
        return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<String> saveProduct(@RequestBody ProductRequestDto productRequestDto){
        return new ResponseEntity<>(productService.saveProduct(productRequestDto), HttpStatus.OK);
    }

    @PutMapping("/{productId}")
    private ResponseEntity<String> updateProduct(@PathVariable Long productId, @RequestBody ProductRequestDto productRequestDto){
        return new ResponseEntity<>(productService.updateProduct(productId, productRequestDto), HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    private ResponseEntity<String> deleteProduct(@PathVariable Long productId){
        return new ResponseEntity<>(productService.deleteProduct(productId), HttpStatus.OK);
    }
}
