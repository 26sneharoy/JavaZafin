package com.zafin.projectBilling.controllers;
import com.zafin.projectBilling.dtos.Transaction;
import com.zafin.projectBilling.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
@Controller
public class TransactionController {
        @Autowired
        TransactionRepository transactionRepository;

        @RequestMapping("/readTransaction")
        public String readTransaction(){
            return "transaction/gettransaction";
        }

        @RequestMapping(value = "/fileread" ,method = RequestMethod.POST)
        public String readTransactionFile(@RequestParam("fileInput") MultipartFile file, Model theModel){
            List<Transaction> transactionRequestList = new ArrayList<>();
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(file.getInputStream()));
//System.out.println("Read");

                String str;
                while ((str = in.readLine()) != null) {
                    String[] tValue = str.split(",");
                    Transaction transactionRequest = new Transaction(tValue[0],tValue[1],tValue[2],tValue[3],tValue[4],(Double.parseDouble(tValue[5])),(Double.parseDouble(tValue[6])),tValue[7]);
                    transactionRequest.setTransactionId(tValue[0]);
                    transactionRequest.setCustomerCode(tValue[1]);
                    transactionRequest.setAccountNumber(tValue[2]);
                    transactionRequest.setProductCode(tValue[3]);
                    transactionRequest.setServiceCode(tValue[4]);
                    transactionRequest.setValue(Double.parseDouble(tValue[5]));
                    transactionRequest.setVolume(Double.parseDouble(tValue[6]));
                    transactionRequest.setProcessDate(tValue[7]);
                    transactionRequestList.add(transactionRequest);
                }

            } catch (IOException e) {
// TODO Auto-generated catch block
                System.out.println("File Read Error");
            }
            finally {
                theModel.addAttribute("transactionRequestList",transactionRequestList);
                System.out.println(transactionRequestList.size());
            }
            return "transaction/gettransaction";
        }



    }

