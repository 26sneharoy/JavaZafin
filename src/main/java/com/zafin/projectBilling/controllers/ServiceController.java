package com.zafin.projectBilling.controllers;

import com.zafin.projectBilling.entities.Service;
import com.zafin.projectBilling.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ServiceController {
    private List<Service> serviceList = new ArrayList<>();
    @Autowired
    private ServiceRepository serviceRepository;

    @RequestMapping("/createService")
    public String createServicePage() {
        return "login/service";
    }

    @RequestMapping(value = "serviceDetails", method = RequestMethod.POST)
    public String register(@ModelAttribute("service") Service service) {

        serviceRepository.save(service);
        return "login/admin";
    }

    @RequestMapping("/getServices")
    public String listServices(Model model) {
       List<Service> services = serviceRepository.findAll();
        model.addAttribute("services", services);
        return "login/servicesList";
    }


}
