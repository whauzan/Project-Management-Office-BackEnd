package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.CustomerRequest;
import com.pbo.pmo.model.Company;
import com.pbo.pmo.model.Customer;
import com.pbo.pmo.repository.CompanyRepository;
import com.pbo.pmo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomerDomain{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Customer> getAllCustomersById(int company_id) {
        System.out.println("get id nichh "+company_id);
        return customerRepository.findAllById(1);
    }

    @Override
    public Customer addCustomer(CustomerRequest customerRequest) {
        Optional<Company> company = companyRepository.findById(customerRequest.company_id);
        System.out.println(company.get().getId());

        Customer customer = new Customer();
        customer.setName(customerRequest.name);;
        customer.setOccupation(customerRequest.occupation);
        customer.setEmail(customerRequest.email);
        customer.setAddress(customerRequest.address);
        customer.setCompany_id(company.get().getId());
        return customerRepository.save(customer);
    }

//    @Override
//    public List<Customer> getAllCustomer() {
//        return customerRepository.findAll();
//    }

}
