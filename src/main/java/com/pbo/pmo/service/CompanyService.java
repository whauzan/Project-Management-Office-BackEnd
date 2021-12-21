package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.CompanyRequest;
import com.pbo.pmo.model.Company;
import com.pbo.pmo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements CompanyDomain {
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company addCompany(CompanyRequest companyRequest) {
        Company company = new Company();
        company.setName(companyRequest.name);
        company.setPhoneNumber(companyRequest.phoneNumber);
        company.setEmail(companyRequest.email);
        company.setAddress(companyRequest.address);
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
