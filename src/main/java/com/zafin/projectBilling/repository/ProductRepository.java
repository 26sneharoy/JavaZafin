package com.zafin.projectBilling.repository;

import com.zafin.projectBilling.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
