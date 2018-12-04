package com.wit.customer.controller;

import com.wit.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/")
public class CustomerController {

    @GetMapping("{id}")
    public ResponseEntity doGet(@PathVariable Long id) {
        return ResponseEntity.ok().body(id + new CustomerService().toString());
    }

    @PostMapping("create/{id}")
    public ResponseEntity doCreate(@PathVariable Long id) {
        return ResponseEntity.ok().body(id + new CustomerService().toString());
    }

    @PostMapping("update/{id}")
    public ResponseEntity doUpdate(@PathVariable String id) {
        return ResponseEntity.ok().body(id + new CustomerService().toString());
    }

    @PostMapping("delete/{id}")
    public ResponseEntity doDelete(@PathVariable Long id) {
        return ResponseEntity.ok().body(id + new CustomerService().toString());
    }

}