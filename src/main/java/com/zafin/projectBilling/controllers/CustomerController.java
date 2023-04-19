package com.zafin.projectBilling.controllers;

import com.zafin.projectBilling.entities.Account;
import com.zafin.projectBilling.entities.Customer;
import com.zafin.projectBilling.entities.Product;
import com.zafin.projectBilling.repositories.AccountRepository;
import com.zafin.projectBilling.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/createCustomer")
    public String createCustomerPage(Model theModel)
    {
        List<Account> accountList = accountRepository.findAll();
        theModel.addAttribute("accountLists",accountList);
        return "login/customer";
    }
    @RequestMapping(value = "customerDetails", method = RequestMethod.POST)
    public String register(@ModelAttribute("customer") Customer customer)
    {
        customerRepository.save(customer);
        return "login/admin";
    }

    @RequestMapping("/getCustomers")
    public String listCustomers(Model model) {
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers", customers);
        return "login/customersList";
    }
}
