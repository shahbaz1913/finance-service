package com.diatoz.service.financeservice.controller;

import com.diatoz.service.financeservice.entity.Response;
import com.diatoz.service.financeservice.repository.UserRepo;
import com.diatoz.service.financeservice.service.BalanceSheetService;
import com.diatoz.service.financeservice.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class BalanceSheetController {

    @Autowired
    BalanceSheetService balanceSheetService;

    @RequestMapping("/balanceSheet")
    ResponseEntity<Response> balanceSheet(@RequestParam String function, @RequestParam String symbol) {
        return balanceSheetService.retrieveBalanceSheet(function, symbol);
    }
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String authenticate(@RequestParam String userName, @RequestParam String password) {
        return this.userService.authenticate(userName, password);
    }
    @GetMapping("/checkResult")
    public String checkResult(){
        return "JwtConfiguration";
    }

}



