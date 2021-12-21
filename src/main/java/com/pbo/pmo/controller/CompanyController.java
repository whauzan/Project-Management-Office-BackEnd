package com.pbo.pmo.controller;

import com.pbo.pmo.Pojos.CompanyRequest;
import com.pbo.pmo.model.Company;
import com.pbo.pmo.service.CompanyDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
@CrossOrigin
public class CompanyController {
    @Autowired
    private CompanyDomain companyDomain;

    @PostMapping("/add")
    public Company addCompany(@RequestBody CompanyRequest companyRequest) {
        return companyDomain.addCompany(companyRequest);
    }

    @GetMapping("/get")
    public List<Company> list() {
        return companyDomain.getAllCompanies();
    }
}
