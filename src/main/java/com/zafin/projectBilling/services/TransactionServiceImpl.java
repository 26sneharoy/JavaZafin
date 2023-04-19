package com.zafin.projectBilling.services;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.zafin.projectBilling.dtos.Transaction;
import com.zafin.projectBilling.entities.Rate;
import com.zafin.projectBilling.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


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
    public void pricing(Transaction transaction) throws DocumentException, FileNotFoundException {
        double price = 0;


        if (customerRepository.existsById(transaction.getCustomerCode())) {
            if (accountRepository.existsById(transaction.getAccountNumber())) {
                if (productRepository.existsById(transaction.getProductCode())) {
                    if (serviceRepository.existsById(transaction.getServiceCode())) {

                        com.zafin.projectBilling.entities.Service service = serviceRepository.findByServiceCode(transaction.getServiceCode());
                        Rate rate = service.getRate();
                        String parameter = rate.getBasedOn();
                        if (parameter.equals("volume")) {
                            double volume = transaction.getVolume();
                            String methodology = rate.getPricingMethodology();
                            if (methodology.equals("whole-tiered")) {
                                price = WholeTier(rate, volume);
                            } else if (methodology.equals("progressive-tiered")) {
                                price = ProgressiveTier(rate, volume);
                            }
                            pdfGeneration(transaction, price);


                        } else if (parameter.equals("value")) {
                            double value = transaction.getValue();
                            String methodology = rate.getPricingMethodology();
                            if (methodology.equals("whole-tiered")) {
                                price = WholeTier(rate, value);
                            } else if (methodology.equals("progressive-tiered")) {
                                price = ProgressiveTier(rate, value);
                            }

                            pdfGeneration(transaction, price);
                        }


                    }
                else System.out.println("invalid Service Code");
                }
                else System.out.println("invalid  Product Code");

            }
            else System.out.println("invalid Account Number");

        }
        else System.out.println("invalid Customer code");


    }

        private double ProgressiveTier (Rate rate,double basedOn){
            int[] min = rate.getMin();
            int[] max = rate.getMax();
            double[] rateValue = rate.getRateValue();
            double price = 0;

            for (int i = 0; i < min.length; i++) {


                if (min[i] < basedOn && basedOn < max[i]) {

                    for (int j = i; j >= 0; j--) {

                        price += rateValue[j];

                    }

                }

            }
            return price;
        }

        private double WholeTier (Rate rate,double basedOn){

            int[] min = rate.getMin();
            int[] max = rate.getMax();
            double[] rateValue = rate.getRateValue();
            double price = 0;

            for (int i = 0; i < min.length; i++) {
                if ((min[i] < basedOn) && (max[i] >= basedOn)) {
                    System.out.println("rate :" + rateValue[i]);
                    price = (rateValue[i] * basedOn) / 100;
                    System.out.println("price :" + price);

                }
            }
            return price;
        }
        public void pdfGeneration (Transaction transaction,double price) throws DocumentException, FileNotFoundException
        {

            Document document = new Document();
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\RebinAbisonZacharias\\" + transaction.getTransactionId() + ".pdf"));
            document.open();
            LineSeparator line = new LineSeparator();
            document.add(line);
            Paragraph h1 = new Paragraph("OHIO BANK");

            document.add(line);
            h1.setAlignment(Element.ALIGN_CENTER);
            document.add(h1);
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("TRANSACTION BILL"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));

            document.add(new Paragraph("Transaction code: " + transaction.getTransactionId()));
            document.add(new Paragraph("Customer id: " + transaction.getCustomerCode()));
            document.add(new Paragraph("Account No: " + transaction.getAccountNumber()));
            document.add(new Paragraph("Amount: " + price));
            document.add(new Paragraph("\n"));

            document.add(line);
            document.add(new Paragraph("\n"));
            Paragraph h2 = new Paragraph("");
            h2.setAlignment(Element.ALIGN_CENTER);
            document.add(h2);
            document.close();
            pdfWriter.close();


        }
    }

