package com.zafin.projectBilling.controllers;

import com.zafin.projectBilling.entities.Account;
import com.zafin.projectBilling.entities.Product;
import com.zafin.projectBilling.repositories.AccountRepository;
import com.zafin.projectBilling.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping("/createAccount")
    public String createAccountPage(Model theModel)
    {
        List<Product> productList = productRepository.findAll();
        theModel.addAttribute("products",productList);
        return "login/account";
    }
    @RequestMapping(value = "accountDetails", method = RequestMethod.POST)
    public String register(@ModelAttribute("account") Account account)
    {
        accountRepository.save(account);
        return "login/admin";
    }
}
