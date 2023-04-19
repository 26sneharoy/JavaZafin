package com.zafin.projectBilling.services;

import com.zafin.projectBilling.dtos.Transaction;
import com.zafin.projectBilling.dtos.Transaction;
import com.zafin.projectBilling.entities.Rate;
import com.zafin.projectBilling.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    RateRepository rateRepository;

    @Autowired
    ServiceRepository serviceRepository;

    @Autowired
    ProductRepository productRepository;
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public double pricing(Transaction transaction) {
        if (serviceRepository.existsById(transaction.getServiceCode())) {
            com.zafin.projectBilling.entities.Service service;
            service = serviceRepository.findByServiceCode(transaction.getServiceCode());
            if (productRepository.existsById(transaction.getProductCode())) {
                if (accountRepository.existsById(transaction.getAccountNumber())) {
                    if (customerRepository.existsById(transaction.getCustomerCode())) {
                        Rate rate = service.getRate();
                        String parameter = rate.getBasedOn();
                        if (parameter.equals("volume")) {
                            double volume = transaction.getVolume();
                            if (rate.getPricingMethodology().equals("wholeTier")) {
                                WholeTier(rate, volume);
                            }
                        } else {

                        }

                    } else {
                        System.out.println("Invalid Customer Code");
                    }
                } else {
                    System.out.println("Invalid Account Number");
                }
            } else {
                System.out.println("Invalid Product Code");
            }
        } else {
            System.out.println("Invalid Service Code");
        }
        return 0;
    }

    private void WholeTier(Rate rate, double volume) {
        int[] min = rate.getMin();
        int[] max = rate.getMax();
        double[] rateValue = rate.getRateValue();

        for (int i = 0; i < min.length; i++) {
            if ((min[i] < volume) && (max[i] >= volume)) {
                System.out.println("rate :" + rateValue[i]);
                System.out.println("price :"+(rateValue[i]*volume)/100);
            }
        }
    }
}
