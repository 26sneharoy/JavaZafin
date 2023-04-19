package com.zafin.projectBilling.repositories;

import com.zafin.projectBilling.dtos.Transaction;
import com.zafin.projectBilling.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface TransactionRepository extends JpaRepository<Transaction,String> {
    }

