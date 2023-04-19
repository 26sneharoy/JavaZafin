package com.zafin.projectBilling.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Service {
     @Id
    private String serviceCode;

    private String serviceName;

    private String serviceDescription;

    private String serviceOwner;

    private LocalDate serviceOpeningDate;

    private LocalDate serviceValidityDate;

    private LocalDate serviceExpiryDate;

    private String serviceCurrency;

    private boolean standAlone;

    private boolean mandatory;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceOwner() {
        return serviceOwner;
    }

    public void setServiceOwner(String serviceOwner) {
        this.serviceOwner = serviceOwner;
    }

    public LocalDate getServiceOpeningDate() {
        return serviceOpeningDate;
    }

    public void setServiceOpeningDate(LocalDate serviceOpeningDate) {
        this.serviceOpeningDate = serviceOpeningDate;
    }

    public LocalDate getServiceValidityDate() {
        return serviceValidityDate;
    }

    public void setServiceValidityDate(LocalDate serviceValidityDate) {
        this.serviceValidityDate = serviceValidityDate;
    }

    public LocalDate getServiceExpiryDate() {
        return serviceExpiryDate;
    }

    public void setServiceExpiryDate(LocalDate serviceExpiryDate) {
        this.serviceExpiryDate = serviceExpiryDate;
    }

    public String getServiceCurrency() {
        return serviceCurrency;
    }

    public void setServiceCurrency(String serviceCurrency) {
        this.serviceCurrency = serviceCurrency;
    }

    public boolean isStandAlone() {
        return standAlone;
    }

    public void setStandAlone(boolean standAlone) {
        this.standAlone = standAlone;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
}
