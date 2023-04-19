package com.zafin.projectBilling.services;

import com.itextpdf.text.DocumentException;
import com.zafin.projectBilling.dtos.Transaction;

import java.io.FileNotFoundException;

public interface TransactionService {
    public void pricing(Transaction transaction) throws DocumentException, FileNotFoundException;
}
