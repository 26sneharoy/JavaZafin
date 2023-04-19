package com.zafin.projectBilling.entities;

import jakarta.persistence.*;

@Entity
public class ProductService {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_code")
    private Product product;
    @OneToOne
    @JoinColumn(name = "service_code")
    private Service service;


}

