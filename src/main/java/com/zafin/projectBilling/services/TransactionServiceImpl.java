package com.zafin.projectBilling.services;

import com.zafin.projectBilling.dtos.Transaction;
import com.zafin.projectBilling.dtos.Transaction;
import com.zafin.projectBilling.entities.Rate;
import com.zafin.projectBilling.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Document;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
     private RateRepository rateRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    ProductRepository productRepository;
    @Autowired
     AccountRepository accountRepository;

    @Autowired
     CustomerRepository customerRepository;


    @Override
    @Transactional
    public double pricing(Transaction transaction) {

        if(customerRepository.existsById(transaction.getCustomerCode())){
            if(accountRepository.existsById(transaction.getAccountNumber())) {
                if (productRepository.existsById(transaction.getProductCode())) {
                    if (serviceRepository.existsById(transaction.getServiceCode())) {
                        com.zafin.projectBilling.entities.Service service= serviceRepository.findByServiceCode(transaction.getServiceCode());
                        Rate rate = service.getRate();
                        String parameter = rate.getBasedOn();
                        if (parameter.equals("volume")) {
                            double volume = transaction.getVolume();
                            WholeTier(rate, volume);

                        }

           }}}}

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
    public void pdfGeneration()
    {


    }
}
