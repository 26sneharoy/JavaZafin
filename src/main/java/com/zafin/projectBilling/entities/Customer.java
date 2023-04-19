package com.zafin.projectBilling.entities;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    private String customerId;
    private String customerName;
    private String customerPhon;
    @OneToOne
    @JoinColumn(name = "account_number")
    private Account account;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhon() {
        return customerPhon;
    }

    public void setCustomerPhon(String customerPhon) {
        this.customerPhon = customerPhon;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
