package com.back.domain.product.repository;

import com.back.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findTopByOrderByIdDesc();
}
