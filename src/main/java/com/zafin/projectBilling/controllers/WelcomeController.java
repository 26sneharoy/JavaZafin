package com.zafin.projectBilling.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/welcomeLogin")
    public String welcomePage(){
        return "login/login";
    }
}
