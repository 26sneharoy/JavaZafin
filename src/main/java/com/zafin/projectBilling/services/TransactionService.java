package com.zafin.projectBilling.services;

import com.zafin.projectBilling.dtos.Transaction;

public interface TransactionService {
    public double pricing(Transaction transaction);
}
