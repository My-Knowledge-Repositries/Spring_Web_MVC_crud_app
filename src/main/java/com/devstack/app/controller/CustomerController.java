package com.devstack.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    public String testEndPoint(){
        return "hello client, i am the customer here!";
    }
}
