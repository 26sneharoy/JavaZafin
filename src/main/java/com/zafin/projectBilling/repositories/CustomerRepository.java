package com.zafin.projectBilling.repositories;

import com.zafin.projectBilling.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
