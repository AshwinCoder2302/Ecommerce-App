package com.ecommerce.app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String SKU;
    private String description;
    private Double price;
    private Integer stock;
    @ManyToOne(fetch = FetchType.EAGER)
    private Category categoryId;
}
