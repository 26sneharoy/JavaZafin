package com.zafin.projectBilling.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rate {

    @Id
    private String rateCode;
    private String rateDescription;

    private String rateType;
    private String pricingMethodology;

    public String getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(String basedOn) {
        this.basedOn = basedOn;
    }

    private String basedOn;

    private double[] rateValue;
    private int[] min;
    private int[] max;

    public double[] getRateValue() {
        return rateValue;
    }

    public void setRateValue(double[] rateValue) {
        this.rateValue = rateValue;
    }

    public int[] getMin() {
        return min;
    }

    public void setMin(int[] min) {
        this.min = min;
    }

    public int[] getMax() {
        return max;
    }

    public void setMax(int[] max) {
        this.max = max;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getRateDescription() {
        return rateDescription;
    }

    public void setRateDescription(String rateDescription) {
        this.rateDescription = rateDescription;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }


    public String getPricingMethodology() {
        return pricingMethodology;
    }

    public void setPricingMethodology(String pricingMethodology) {
        this.pricingMethodology = pricingMethodology;
    }
}
