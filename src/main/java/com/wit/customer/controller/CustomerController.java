package com.wit.customer.controller;

import com.wit.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/")
public class CustomerController {

    @GetMapping("get")
    public ResponseEntity getCustomerDetails() {
        return ResponseEntity.ok().body(new CustomerService().toString());
    }

}