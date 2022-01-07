package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.CustomerRequest;
import com.pbo.pmo.model.Company;
import com.pbo.pmo.model.Customer;
import com.pbo.pmo.repository.CompanyRepository;
import com.pbo.pmo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerDomain{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Customer> getAllCustomersById(int company_id) {
        return customerRepository.findAllByCompanyId(company_id);
    }

    @Override
    public Customer addCustomer(CustomerRequest customerRequest) {
        Company company = companyRepository.findById(customerRequest.company_id)
                .orElseThrow(() -> new IllegalStateException(
                        "company with id " + customerRequest.company_id + " does not exist"
                ));

        Customer customer = new Customer();
        customer.setName(customerRequest.name);;
        customer.setOccupation(customerRequest.occupation);
        customer.setEmail(customerRequest.email);
        customer.setAddress(customerRequest.address);
        customer.setCompany_id(company.getId());
        return customerRepository.save(customer);
    }
}
