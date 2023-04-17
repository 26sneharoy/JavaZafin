package com.zafin.projectBilling.repositories;

import com.zafin.projectBilling.entities.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rate,String> {
}
