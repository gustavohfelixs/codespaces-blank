package com.gfelix.springsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    
    @GetMapping("/myBalance")
    public String getBalanceDetails() {
        return "here are the balance detials from de DB";
    }

}