package com.zafin.projectBilling.repositories;


import com.zafin.projectBilling.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
