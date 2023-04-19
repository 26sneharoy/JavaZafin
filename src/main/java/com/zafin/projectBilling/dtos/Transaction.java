package com.zafin.projectBilling.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Transaction {
        @Id
        private String transactionId;

        private String customerCode;

        private String accountNumber;


        private String productCode;
        private String  serviceCode;
        private double volume;
        private double value;
        private String transactionDate;
        private String processDate;

        public Transaction(String transactionId, String customerCode, String accountNumber, String productCode, String serviceCode, double volume, double value, String transactionDate) {
                this.transactionId = transactionId;
                this.customerCode = customerCode;
                this.accountNumber = accountNumber;
                this.productCode = productCode;
                this.serviceCode = serviceCode;
                this.volume = volume;
                this.value = value;
                this.transactionDate = transactionDate;
        }

        public String getTransactionId() {
                return transactionId;
        }

        public void setTransactionId(String transactionId) {
                this.transactionId = transactionId;
        }

        public String getCustomerCode() {
                return customerCode;
        }

        public void setCustomerCode(String customerCode) {
                this.customerCode = customerCode;
        }

        public String getAccountNumber() {
                return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
                this.accountNumber = accountNumber;
        }

        public String getProductCode() {
                return productCode;
        }

        public void setProductCode(String productCode) {
                this.productCode = productCode;
        }

        public String getServiceCode() {
                return serviceCode;
        }

        public void setServiceCode(String serviceCode) {
                this.serviceCode = serviceCode;
        }

        public double getVolume() {
                return volume;
        }

        public void setVolume(double volume) {
                this.volume = volume;
        }

        public double getValue() {
                return value;
        }

        public void setValue(double value) {
                this.value = value;
        }

        public String getTransactionDate() {
                return transactionDate;
        }

        public void setTransactionDate(String transactionDate) {
                this.transactionDate = transactionDate;
        }


        public String getProcessDate() {
                return processDate;
        }

        public void setProcessDate(String processDate) {
                this.processDate = processDate;
        }
}

