package com.wit.customer.controller;

import com.wit.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/")
public class CustomerController {

    @GetMapping("{id}")
    public ResponseEntity doGet(@PathVariable long id) {
        return ResponseEntity.ok().body(id + new CustomerService().toString());
    }

    @PostMapping("create")
    public ResponseEntity doCreate() {
        return ResponseEntity.ok().body(new CustomerService().toString());
    }

    @PutMapping("update/{id}")
    public ResponseEntity doUpdate(@PathVariable long id) {
        return ResponseEntity.ok().body(id + new CustomerService().toString());
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity doDelete(@PathVariable long id) {
        return ResponseEntity.ok().body(id + new CustomerService().toString());
    }

}