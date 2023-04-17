package com.zafin.projectBilling.controllers;

import com.zafin.projectBilling.entities.Rate;
import com.zafin.projectBilling.repositories.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RateController {
    @Autowired
    RateRepository rateRepository;

    @RequestMapping("/showLogin")
    public String showRegistrationPage(){
        return "login/displayRates";
    }

    @RequestMapping(value = "/displayRates" ,method = RequestMethod.POST)
    public String showRatePage(@ModelAttribute("rate")Rate rate){
        rateRepository.save(rate);
        return "/login/welcomeLogin";
    }


}
