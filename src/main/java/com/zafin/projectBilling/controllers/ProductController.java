package com.zafin.projectBilling.controllers;

import com.zafin.projectBilling.entities.Product;
import com.zafin.projectBilling.repositories.ProductRepository;
import com.zafin.projectBilling.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ServiceRepository serviceRepository;

    @RequestMapping("/createProduct")
    public String createProductPage()
    {
        return "login/product";
    }

    @RequestMapping(value = "productDetails", method = RequestMethod.POST)
    public String register(@ModelAttribute("product") Product product)
    {
        productRepository.save(product);
        return "login/admin";
    }
}
