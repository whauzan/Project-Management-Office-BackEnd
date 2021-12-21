package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.CustomerRequest;
import com.pbo.pmo.model.Customer;

import java.util.List;

public interface CustomerDomain {
    public List<Customer> getAllCustomersById(int company_id);
    public Customer addCustomer(CustomerRequest customerRequest);
}
