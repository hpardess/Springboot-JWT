package com.hpardess.jwt.customer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @GetMapping()
    public String getCustomers() {
        return "Get Customers called";
    }
}