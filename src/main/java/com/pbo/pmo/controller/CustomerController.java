package com.pbo.pmo.controller;

import com.pbo.pmo.Pojos.CustomerRequest;
import com.pbo.pmo.model.Customer;
import com.pbo.pmo.service.CustomerDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerDomain customerDomain;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody CustomerRequest customerRequest){
        return customerDomain.addCustomer(customerRequest);
    }

    @GetMapping("/get")
    public List<Customer> list(@RequestBody CustomerRequest customerRequest) {
        return customerDomain.getAllCustomersById(customerRequest.company_id);
    };
}
