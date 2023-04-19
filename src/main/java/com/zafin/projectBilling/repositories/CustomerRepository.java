package com.zafin.projectBilling.repositories;

import com.zafin.projectBilling.entities.Customer;
import com.zafin.projectBilling.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}