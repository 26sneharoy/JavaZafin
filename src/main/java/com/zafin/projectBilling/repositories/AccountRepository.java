package com.zafin.projectBilling.repositories;


import com.zafin.projectBilling.entities.Account;
import com.zafin.projectBilling.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
