package com.zafin.projectBilling.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping("/adminPage")
    public String adminPage()
    {
        return "login/admin";
    }

}