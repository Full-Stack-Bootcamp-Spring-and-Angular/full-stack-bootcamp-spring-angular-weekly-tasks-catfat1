package com.example.productcrud.repository;

import com.example.productcrud.entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailsRepository
        extends JpaRepository<ProductDetails,Long> {
}

