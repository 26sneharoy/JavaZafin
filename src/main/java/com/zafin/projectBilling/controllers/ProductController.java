package com.zafin.projectBilling.controllers;

import com.zafin.projectBilling.entities.Product;
import com.zafin.projectBilling.entities.Service;
import com.zafin.projectBilling.repositories.ProductRepository;
import com.zafin.projectBilling.repositories.ServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.IdGenerator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    ServiceRepository serviceRepository;

    IdGenerator idGenerator;

    @RequestMapping("/createProduct")
    public String createProductPage(ModelMap modelMap)
    {
        List<Service> serviceList= serviceRepository.findAll();
        modelMap.addAttribute("serviceList", serviceList);
        return "login/product";
    }

    @RequestMapping(value = "productDetails", method = RequestMethod.POST)
    public String register(@ModelAttribute("product") Product product, Model theModel, @RequestParam("services") String[] selectedServices)
    {
        List<Service> serviceLists =new ArrayList<>();
        List<Service> serviceList = serviceRepository.findAll();


        for (int i = 0; i < selectedServices.length; i++) {
            for(Service service: serviceList){
                if(service.getServiceCode().equals(selectedServices[i])) {
                    serviceLists.add(service);
                }
            }}

        product.setServices(serviceLists);

        productRepository.save(product);
        return "login/admin";
    }
}
