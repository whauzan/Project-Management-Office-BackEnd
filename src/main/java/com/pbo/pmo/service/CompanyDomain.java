package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.CompanyRequest;
import com.pbo.pmo.model.Company;

import java.util.List;

public interface CompanyDomain {

    public Company addCompany(CompanyRequest companyRequest);
    public List<Company> getAllCompanies();
}
