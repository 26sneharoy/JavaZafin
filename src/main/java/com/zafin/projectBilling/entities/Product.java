package com.zafin.projectBilling.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity
public class Product {
    @Id
    private String productCode;

    private String productName;

    private String productDescription;

    private String productOwner;

    private LocalDate productOpeningDate;

    private LocalDate productValidityDate;

    private LocalDate productExpiryDate;
    private String productCurrency;

    private int productLevelRate;

    public int getProductLevelRate() {
        return productLevelRate;
    }

    public void setProductLevelRate(int productLevelRate) {
        this.productLevelRate = productLevelRate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(String productOwner) {
        this.productOwner = productOwner;
    }

    public LocalDate getProductOpeningDate() {
        return productOpeningDate;
    }

    public void setProductOpeningDate(LocalDate productOpeningDate) {
        this.productOpeningDate = productOpeningDate;
    }

    public LocalDate getProductValidityDate() {
        return productValidityDate;
    }

    public void setProductValidityDate(LocalDate productValidityDate) {
        this.productValidityDate = productValidityDate;
    }

    public LocalDate getProductExpiryDate() {
        return productExpiryDate;
    }

    public void setProductExpiryDate(LocalDate productExpiryDate) {
        this.productExpiryDate = productExpiryDate;
    }

    public String getProductCurrency() {
        return productCurrency;
    }

    public void setProductCurrency(String productCurrency) {
        this.productCurrency = productCurrency;
    }
}
