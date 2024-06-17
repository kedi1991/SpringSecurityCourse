package com.kedi.security.springsecurity.repository;

import com.kedi.security.springsecurity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
