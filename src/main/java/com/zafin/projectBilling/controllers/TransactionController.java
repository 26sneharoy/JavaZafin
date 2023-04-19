package com.zafin.projectBilling.controllers;
import com.zafin.projectBilling.dtos.Transaction;
import com.zafin.projectBilling.repositories.TransactionRepository;
import com.zafin.projectBilling.services.TransactionService;
import com.zafin.projectBilling.services.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
@Controller
public class TransactionController {
        @Autowired
        private TransactionRepository transactionRepository;
        @Autowired
        TransactionService transactionService ;

        @RequestMapping("/readTransaction")
        public String readTransaction(){
            return "login/transaction";
        }

        @RequestMapping(value = "/fileread" ,method = RequestMethod.POST)
        public String readTransactionFile(@RequestParam("fileInput") MultipartFile file, Model theModel){
            List<Transaction> transactionList = new ArrayList<>();

            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(file.getInputStream()));


                String str;
                while ((str = in.readLine()) != null) {
                    String[] tValue = str.split(",");
                    Transaction transaction = new Transaction(tValue[0],tValue[1],tValue[2],tValue[3],tValue[4],(Double.parseDouble(tValue[5])),(Double.parseDouble(tValue[6])),tValue[7]);
//                    transaction.setTransactionId(tValue[0]);
//                    transaction.setCustomerCode(tValue[1]);
//                    transaction.setAccountNumber(tValue[2]);
//                    transaction.setProductCode(tValue[3]);
//                    transaction.setServiceCode(tValue[4]);
//                    transaction.setValue(Double.parseDouble(tValue[5]));
//                    transaction.setVolume(Double.parseDouble(tValue[6]));
//                    transaction.setProcessDate(tValue[7]);
                    transactionList.add(transaction);

                }

            } catch (IOException e) {

                System.out.println("File Read Error");
            }
            finally {
                theModel.addAttribute("transactionRequestList",transactionList);

                for(Transaction transaction:transactionList){
                    transactionService.pricing(transaction);
                }
            }
            return "login/transaction";
        }



    }

