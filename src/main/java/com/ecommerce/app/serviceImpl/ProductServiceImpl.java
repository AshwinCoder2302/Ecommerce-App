package com.ecommerce.app.serviceImpl;

import com.ecommerce.app.entity.Category;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.repository.ProductRepository;
import com.ecommerce.app.reqeust.dto.ProductRequestDto;
import com.ecommerce.app.response.dto.CategoryResponseDto;
import com.ecommerce.app.response.dto.ProductResponseDto;
import com.ecommerce.app.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductResponseDto getProductById(Long productId) {
        Optional<Product> product = productRepository.findById(productId);
        if(product.isPresent()){
            ProductResponseDto productResponseDto = new ProductResponseDto();
            BeanUtils.copyProperties(product.get(), productResponseDto);
            CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
            categoryResponseDto.setCategoryId(product.get().getCategoryId().getCategoryId());
            categoryResponseDto.setName(product.get().getCategoryId().getName());
            productResponseDto.setCategoryResponseDtoId(categoryResponseDto);
            return productResponseDto;
        }else {
            return null;
        }
    }

    @Override
    public List<ProductResponseDto> getAllProduct() {
        List<Product> productList = productRepository.findAll();
        List<ProductResponseDto> productResponseDtoList = productList.stream().map(product -> convertProductResponse(product)).toList();
        return productResponseDtoList;
    }

    @Override
    public String saveProduct(ProductRequestDto productRequestDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productRequestDto, product);
        Category category = new Category();
        category.setCategoryId(productRequestDto.getCategoryRequestDtoId().getCategoryId());
        category.setName(productRequestDto.getCategoryRequestDtoId().getName());
        product.setCategoryId(category);
        Product savedProduct = productRepository.save(product);
        if(savedProduct != null) {
            return "Saved Successfully";
        } else {
            return null;
        }
    }

    @Override
    public String updateProduct(Long productId, ProductRequestDto productRequestDto) {
        Optional<Product> existingProduct = productRepository.findById(productId);
        if(existingProduct.isPresent()) {
            Category category = new Category();
            category.setCategoryId(productRequestDto.getCategoryRequestDtoId().getCategoryId());
            category.setName(productRequestDto.getCategoryRequestDtoId().getName());
            BeanUtils.copyProperties(productRequestDto.getCategoryRequestDtoId(), category);
            Product productNew = existingProduct.get();
            productNew.setCategoryId(category);
            productNew.setSKU(productRequestDto.getSKU());
            productNew.setStock(productRequestDto.getStock());
            productNew.setPrice(productRequestDto.getPrice());
            productNew.setDescription(productRequestDto.getDescription());
            Product savedProduct = productRepository.save(productNew);
            if(savedProduct != null) {
                return "Updated Successfully";
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public String deleteProduct(Long productId) {
        Optional<Product> existingProduct = productRepository.findById(productId);
        if(existingProduct.isPresent()) {
            productRepository.deleteById(productId);
            return "Deleted Successfully";
        } else {
            return null;
        }
    }

    public ProductResponseDto convertProductResponse(Product product){
        ProductResponseDto productResponseDto = new ProductResponseDto();
        BeanUtils.copyProperties(product, productResponseDto);
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        categoryResponseDto.setCategoryId(product.getCategoryId().getCategoryId());
        categoryResponseDto.setName(product.getCategoryId().getName());
        productResponseDto.setCategoryResponseDtoId(categoryResponseDto);
        return productResponseDto;
    }
}
